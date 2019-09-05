/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipu.primaryaccounting.daoimpl;

import com.dipu.primaryaccounting.dao.AccountHeadService;
import com.dipu.primaryaccounting.model.AccountChart;

import com.google.gson.Gson;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

/**
 *
 * @author SKY IT
 */
@Repository
public class AccountHeadServiceImpl implements AccountHeadService {

    @Autowired
    SessionFactory sessionfactory;

    @Override
    public String insertAccounthead(AccountChart head) {

        Session s = sessionfactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
         //if we get current user information then write this code . 
             Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {

            String username = ((UserDetails) principal).getUsername();
            head.setU_id(username);
        } else {

            String username = principal.toString();
            head.setU_id(username);
        }
        
        s.save(head);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String updateAccounthead(AccountChart head) {
        Session s = sessionfactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        s.update(head);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String deleteAccounthead(int id) {
        Session s = sessionfactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        AccountChart head = (AccountChart) s.get(AccountChart.class, id);
        head.setStatus("Deleted");
        s.update(head);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String viewAccounthead() {
        Session s = sessionfactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        //if show data like status then write this coad ; or seccond line
        //List<Accounttype> accountlist = s.createQuery("from Accounttype where status ='Active'").list();
        List<AccountChart> accountheadlist = s.createQuery("from AccountChart").list();
        Gson g = new Gson();
        String accountlistgson = g.toJson(accountheadlist);
        t.commit();
        s.close();
        return accountlistgson;
    }

    @Override
    public AccountChart viewoneAccounthead(int id) {
        Session s = sessionfactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        AccountChart head = (AccountChart) s.get(AccountChart.class, id);
        t.commit();
        s.close();
        Gson g = new Gson();
        String subgson = g.toJson(head);
        return head;
    }

    @Override
    public String viewroothead() {
          Session s = sessionfactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        //if show data like status then write this coad ; or seccond line
          List<AccountChart> falserootheadlist = s.createQuery("from AccountChart where root = 'Not'").list();
        
        Gson g = new Gson();
        String accountlistgson = g.toJson(falserootheadlist);
        t.commit();
        s.close();
        return accountlistgson;
    }
    


}
