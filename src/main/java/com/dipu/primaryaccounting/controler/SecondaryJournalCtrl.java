/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipu.primaryaccounting.controler;

import com.dipu.primaryaccounting.model.MasteJournal;
import com.dipu.primaryaccounting.model.SecondaryJournal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author SKY IT
 */
@Controller
public class SecondaryJournalCtrl {
                     @RequestMapping("/showsecondaryjournalctrlpage")
    public ModelAndView showsubjectpage() {
        ModelAndView mv = new ModelAndView("secondaryjournal", "secondaryjournalModelobject",new SecondaryJournal());
        return mv;
    }
}