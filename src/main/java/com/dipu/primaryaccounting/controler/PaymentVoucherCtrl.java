/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipu.primaryaccounting.controler;

import com.dipu.primaryaccounting.dao.AccountHeadService;
import com.dipu.primaryaccounting.dao.PaymentVoucherService;

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
public class PaymentVoucherCtrl {

    @Autowired
    PaymentVoucherService payservice;
    @Autowired
    AccountHeadService acchead;

     @InitBinder
    public void myInitBinder(WebDataBinder binder) {
        //binder.setDisallowedFields(new String[]{"empMobile"});
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        binder.registerCustomEditor(Date.class, "paydate", new CustomDateEditor(format, false));
//        binder.registerCustomEditor(String.class, "ename", new EmployeeNameEditor());
    }

    @RequestMapping("/cashpayment")
    public ModelAndView showsubjectpage() {
        String allacchead = acchead.viewroothead();
        String allrow= payservice.allrowcount();
        ModelAndView mv = new ModelAndView("cashpayment", "paymentvoucherobject", new MasterJournal());
        mv.addObject("allaccheadlist", allacchead);
        mv.addObject("allrownum", allrow);
        mv.addObject("check",true);

        return mv;
    }
    
        @RequestMapping("/chequepayment")
    public ModelAndView gochequepayment() {
        String allacchead = acchead.viewroothead();

        ModelAndView mv = new ModelAndView("chequepayment", "paymentvoucherobject", new MasterJournal());
        mv.addObject("allaccheadlist", allacchead);
        mv.addObject("check",true);

        return mv;
    }

    @RequestMapping(value = "/addingpaymentvoucher", params = "Add")
    public String addmenu(@ModelAttribute("paymentvoucherobject") MasterJournal mj) { 
        mj.setVoucher_type("Debit Voucher");

        payservice.insertpaymet(mj);
       
        return "redirect:/cashpayment";
    }
    
    

}
