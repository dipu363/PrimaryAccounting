/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipu.primaryaccounting.controler;

import com.dipu.primaryaccounting.dao.AccountHeadService;
import com.dipu.primaryaccounting.dao.JeneralJournalService;
import com.dipu.primaryaccounting.dao.PaymentVoucherService;
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

public class JeneralJournalCtrl {

    @Autowired
    JeneralJournalService journalservice;
    @Autowired
    AccountHeadService acchead;

    @InitBinder
    public void myInitBinder(WebDataBinder binder) {
        //binder.setDisallowedFields(new String[]{"empMobile"});
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        binder.registerCustomEditor(Date.class, "tancsectiondate", new CustomDateEditor(format, false));
//        binder.registerCustomEditor(String.class, "ename", new EmployeeNameEditor());
    }

    @RequestMapping("/journalctrlpage")
    public ModelAndView showsubjectpage() {

        String allacchead = acchead.viewroothead();
        int rendnumber = journalservice.genareterendom();
        String demojour = journalservice.viewdemodetails();
        ModelAndView mv = new ModelAndView("generaljournal", "generaljournalModelobject", new MasterJournal());
        mv.addObject("allaccheadlist", allacchead);
        mv.addObject("rendint", rendnumber);
        mv.addObject("demodetail", demojour);
        mv.addObject("check", "true");
       
        
        return mv;
    }
    
       @RequestMapping(value = "/addingpaymentvoucher", params = "Add")
    public String addmenu(@ModelAttribute("generaljournalModelobject") MasterJournal mj) {  
        journalservice.insertjournal(mj);
        return "redirect:/journalctrlpage";
    }

}
