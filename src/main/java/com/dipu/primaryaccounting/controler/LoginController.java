package com.dipu.primaryaccounting.controler;



import com.dipu.primaryaccounting.dao.Userservice;
import com.dipu.primaryaccounting.model.User;
import java.util.Collection;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @Autowired
    Userservice user;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLogin() {
        return "login";
    }

    @RequestMapping(value = "/admindeshboard", method = RequestMethod.GET)
    public String showWelcome() {
        return "admindeshboard";
    }

    @RequestMapping(value = "/loginsuccess")
    public String loginsuccess(HttpSession session) {
        System.out.println("success..........");

        String userid = SecurityContextHolder.getContext().getAuthentication().getName();
        User us = user.viewUser(userid);
        Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        String page = "";
        String role = "ROLE_ADMIN";
        for (GrantedAuthority authority : authorities) {
            if (authority.getAuthority().equals(role)) {
//                session.setAttribute("UserLoggedIn", us.getUsername());
//                session.setAttribute("phone", us.getPhone());          
//                session.setAttribute("UserId", userid);
                page= "redirect:/admindeshboard";
            }
            else{
            page= "redirect:/";
            }
        }
        return page;
    }
}
