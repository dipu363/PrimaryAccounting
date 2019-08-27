/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipu.primaryaccounting.controler;

import com.dipu.primaryaccounting.dao.AccountService;
import com.dipu.primaryaccounting.model.Accounttype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author SKY IT
 */
@Controller
public class AccountHolderCtrl {

    @Autowired
    AccountService aser;

    @RequestMapping("/showaccountholderpage")
    public ModelAndView showaccountpage() {
        String typelist = aser.viewAccounttype();
        ModelAndView mv = new ModelAndView("showaccountholder", "showaccountModelobject", new Accounttype());
        mv.addObject("acctypelist", typelist);
        mv.addObject("check", true);

        return mv;
    }

    @RequestMapping("/addaccountholderpage")
    public ModelAndView addaccountpage() {
        String typelist = aser.viewAccounttype();
        ModelAndView mv = new ModelAndView("addaccountholder", "addaccountModelobject", new Accounttype());
        mv.addObject("acctypelist", typelist);
        mv.addObject("check", true);

        return mv;
    }

    @RequestMapping(value = "/accounttype", params = "Add")
    public String Accounttype(@ModelAttribute("addaccountModelobject") Accounttype at) {
        aser.insertAccounttype(at);
        return "redirect:/addaccountholderpage";
    }

    @RequestMapping(value = "/accounttype", params = "Edit")
    public String editaccounttype(@ModelAttribute("addaccountModelobject") Accounttype at) {
        aser.updateAccounttype(at);
        return "redirect:/showaccountholderpage";
    }

    @RequestMapping("/editingaccounttypebtn")
    public ModelAndView passingoneaccount(@RequestParam("getid") int accountId) {
        Accounttype oneacountype = aser.viewoneAccounttype(accountId);
        String typelist = aser.viewAccounttype();
        ModelAndView mv = new ModelAndView("showaccountholder", "showaccountModelobject", oneacountype);
        mv.addObject("acctypelist", typelist);
        mv.addObject("check", true);
        return mv;
    }

    @RequestMapping("removeaccount/{Id}")
    public String removesubject(@PathVariable("Id") int id) {
        aser.deleteAccounttype(id);
        return "redirect:/showaccountholderpage";
    }
}
