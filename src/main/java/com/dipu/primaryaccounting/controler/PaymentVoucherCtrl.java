/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipu.primaryaccounting.controler;

import com.dipu.primaryaccounting.dao.AccountHeadService;
import com.dipu.primaryaccounting.dao.PaymentVoucherService;

import com.dipu.primaryaccounting.model.MasteJournal;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
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
    @RequestMapping("/paymentvoucherctrlpage")
    public ModelAndView showsubjectpage() {
        String allacchead = acchead.viewroothead();
        
        ModelAndView mv = new ModelAndView("paymentvoucher", "paymentvoucherobject",new MasteJournal());
        mv.addObject("allaccheadlist", allacchead);
        
        return mv;
    }
    
         @RequestMapping(value = "/addingpaymentvoucher", params = "Add")
    public String addmenu(@ModelAttribute("paymentvoucherobject") MasteJournal mj) {
        mj.setCredit(mj.getDebit());
        mj.setVoucher_type("Paymet voucher");
        mj.setSec_status("True");
        payservice.insertpaymet(mj);
        return "redirect:/paymentvoucherctrlpage";
    }
}
