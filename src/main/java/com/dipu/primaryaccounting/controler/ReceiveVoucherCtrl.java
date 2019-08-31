/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipu.primaryaccounting.controler;

import com.dipu.primaryaccounting.dao.AccountHeadService;
import com.dipu.primaryaccounting.dao.PaymentVoucherService;
import com.dipu.primaryaccounting.dao.RecivedVoucherService;
import com.dipu.primaryaccounting.model.Accounttype;
import com.dipu.primaryaccounting.model.MasterJournal;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author SKY IT
 */
@Controller
public class ReceiveVoucherCtrl {
    
       @Autowired
       RecivedVoucherService reciveservice;
    @Autowired
    AccountHeadService acchead;
    
    
    
    
         @InitBinder
    public void myInitBinder(WebDataBinder binder) {
        //binder.setDisallowedFields(new String[]{"empMobile"});
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        binder.registerCustomEditor(Date.class, "paydate", new CustomDateEditor(format, false));
//        binder.registerCustomEditor(String.class, "ename", new EmployeeNameEditor());
    }
    @RequestMapping("/cashrecived")
    public ModelAndView showcashrecivepage() {
   String allrow= reciveservice.allrowcount();
         String allacchead = acchead.viewAccounthead();
        ModelAndView mv = new ModelAndView("cashrecivedvoucher", "recivevoucherobject",new MasterJournal());
        mv.addObject("allrownum", allrow);
        mv.addObject("allcreditaccheadlist", allacchead);
        mv.addObject("check",true);
        return mv;
    }
    
        @RequestMapping(value = "/addingrecivevoucher", params = "Add")
    public String cashreciveinsert(@ModelAttribute("recivevoucherobject") MasterJournal mj) { 
        mj.setVoucher_type("Credit Voucher");

        reciveservice.insertrecived(mj);
       
        return "redirect:/cashrecived";
    }
    
    
}
