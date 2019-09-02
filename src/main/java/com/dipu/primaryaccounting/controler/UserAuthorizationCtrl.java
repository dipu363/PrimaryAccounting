/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipu.primaryaccounting.controler;


import com.dipu.primaryaccounting.model.UserAuthorization;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author SKY IT
 */
@Controller
public class UserAuthorizationCtrl {
                    @RequestMapping("/userauthorizationpage")
    public ModelAndView showsubjectpage() {
        ModelAndView mv = new ModelAndView("userauthorization", "authorizationModelobject",new UserAuthorization());
        mv.addObject("check", true);
        return mv;
    }
    
}
