/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipu.primaryaccounting.controler;

import com.dipu.primaryaccounting.model.Accounttype;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author SKY IT
 */
@Controller

public class JeneralJournalCtrl {
    
                        @RequestMapping("/journalctrlpage")
    public ModelAndView showsubjectpage() {
        ModelAndView mv = new ModelAndView("generaljournal", "generaljournalModelobject",new Accounttype());
        mv.addObject("chack","true");
        return mv;
    }
 
    
    
    
    
}