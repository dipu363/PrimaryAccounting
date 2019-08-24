/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipu.primaryaccounting.controler;

import com.dipu.primaryaccounting.dao.AccountHeadService;
import com.dipu.primaryaccounting.model.AccountChart;
import com.dipu.primaryaccounting.model.Accounttype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author SKY IT
 */
@Controller
public class AccountchartCtrl {
    
    @Autowired
    AccountHeadService head;
              @RequestMapping("/addaccounthead")
    public ModelAndView addaccountheadpage() {
        String allfalseroot = head.viewroothead();
          
        ModelAndView mv = new ModelAndView("addAccoutnhead", "accoutnheadobject",new AccountChart());
      
         mv.addObject("falseroothead", allfalseroot);
        mv.addObject("check", "true");
        return mv;
    }
    
                  @RequestMapping("/showaccounthead")
    public ModelAndView showaccountheadpage() {
        
        String allheads = head.viewAccounthead();
        ModelAndView mv = new ModelAndView("showaccounthead", "accoutnheadobject",new AccountChart());  
        mv.addObject("headlists", allheads);
        
        return mv;
    }
    
            @RequestMapping(value = "/inserthead", params = "Add")
    public String Accounttype(@ModelAttribute("accoutnheadobject") AccountChart ah) {
        head.insertAccounthead(ah);
        return "redirect:/addaccounthead";
    }
           @RequestMapping(value = "/inserthead", params = "Edit")
    public String editHead(@ModelAttribute("accoutnheadobject") AccountChart ah) {
        head.updateAccounthead(ah);
        return "redirect:/addaccounthead";
    }
    
            @RequestMapping("/editbutton")
    public ModelAndView passingonehead(@RequestParam("getid") int headid) {

      AccountChart onehead = head.viewoneAccounthead(headid);
         String allheads = head.viewAccounthead();
        ModelAndView mv = new ModelAndView("addAccoutnhead", "accoutnheadobject", onehead);
        mv.addObject("headlists", allheads);
         mv.addObject("check", "false");
        return mv;
    }
}
