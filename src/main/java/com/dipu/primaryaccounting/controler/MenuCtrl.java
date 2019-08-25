/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipu.primaryaccounting.controler;

import com.dipu.primaryaccounting.dao.MenuService;
import com.dipu.primaryaccounting.model.Author;
import com.dipu.primaryaccounting.model.UserMenu;
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
public class MenuCtrl {
    @Autowired
    MenuService menu;
          @RequestMapping("/showmenuctrlpage")
    public ModelAndView showsubjectpage() {
    String menulist = menu.viewMenu();
        ModelAndView mv = new ModelAndView("addmenu", "menuobject",new UserMenu());
        mv.addObject("menulists", menulist);
        mv.addObject("check", true);
        return mv;
    }
        
        @RequestMapping(value = "/addingmenu", params = "Add")
    public String addmenu(@ModelAttribute("menuobject") UserMenu m) {
        menu.insertMenu(m);
        return "redirect:/showmenuctrlpage";
    }
    
    
    
          @RequestMapping(value = "/addingmenu", params = "Edit")
    public String editmenu(@ModelAttribute("menuobject") UserMenu m) {
        menu.updateMenu(m);
        return "redirect:/showmenuctrlpage";
    }
          @RequestMapping("/editmenu")
    public ModelAndView passinmenu(@RequestParam("getid") int menuid) {

      UserMenu onemenu = menu.viewoneMenu(menuid);
        String menulist = menu.viewMenu();
        ModelAndView mv = new ModelAndView("addmenu", "menuobject", onemenu);
        mv.addObject("menulists", menulist);
         mv.addObject("check", "false");
        return mv;
    }
            @RequestMapping("removemenu/{Id}")
    public String removemenu(@PathVariable("Id") int id) {
        menu.deleteMenu(id);
        return "redirect:/showmenuctrlpage";
    }
}
