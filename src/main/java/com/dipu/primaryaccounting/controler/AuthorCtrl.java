/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipu.primaryaccounting.controler;

import com.dipu.primaryaccounting.dao.AuthorService;
import com.dipu.primaryaccounting.model.Author;
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
public class AuthorCtrl {
    @Autowired
    AuthorService as;
        @RequestMapping("/showAuthorpage")
    public ModelAndView showsubjectpage() {
         String authorlist = as.viewAuthor();
        ModelAndView mv = new ModelAndView("author", "authorobject",new Author());
        mv.addObject("authormodelobject",authorlist);
          mv.addObject("check", "true");
        
        return mv;
    }
    
        @RequestMapping(value = "/Addingauthor", params = "Addauthor")
    public String addgroup(@ModelAttribute("authorModelobject") Author author) {
        as.insertAuthor(author);
        return "redirect:/showAuthorpage";
    }
    
    
    
       @RequestMapping(value = "/Addingauthor", params = "Editauthor")
    public String editgroup(@ModelAttribute("addGroupObject1") Author author) {
        as.updateAuthor(author);
        return "redirect:/showAuthorpage";
    }
    
        @RequestMapping("/editauthorbutton")
    public ModelAndView passingoneauthor(@RequestParam("getid") int groupId) {

      Author oneauthor = as.viewoneAuthor(groupId);
        String auhtorjsonlist = as.viewAuthor();
        ModelAndView mv = new ModelAndView("author", "authorobject", oneauthor);
        mv.addObject("authormodelobject", auhtorjsonlist);
         mv.addObject("check", "false");
        return mv;
    }
    
        @RequestMapping("removeauthor/{Id}")
    public String removesubject(@PathVariable("Id") int id) {
        as.deleteAuthor(id);
        return "redirect:/showAuthorpage";
    }
}
