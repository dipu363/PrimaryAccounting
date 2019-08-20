/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipu.primaryaccounting.daoimpl;

import com.dipu.primaryaccounting.dao.AccountService;
import com.dipu.primaryaccounting.model.Accounttype;

import com.google.gson.Gson;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author SKY IT
 */
@Repository
public class AccountServiceImpl implements AccountService{
@Autowired 
SessionFactory sessionfactory;
    @Override
    public String insertAccounttype(Accounttype at) {
           Session s = sessionfactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        s.save(at);
        t.commit();
        s.close();
       return null; 
    }

    @Override
    public String updateAccounttype(Accounttype actype) {
       Session s = sessionfactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        s.update(actype);
        t.commit();
        s.close();
       return null;
    }

    @Override
    public String deleteAccounttype(int id) {
       
      Session s = sessionfactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        Accounttype author = (Accounttype) s.get(Accounttype.class, id);
        author.setStatus("deleted");
        s.update(author);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String viewAccounttype() {
      
     Session s = sessionfactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        //if show data like status then write this coad ; or seccond line
        List<Accounttype> accountlist = s.createQuery("from Accounttype where status ='Active'").list();
       //  List<Accounttype> accountlist = s.createQuery("from Accounttype").list();
        Gson g = new Gson();
        String accountlistgson = g.toJson(accountlist);
        t.commit();
        s.close();
        return accountlistgson;
    }

    @Override
    public Accounttype viewoneAccounttype(int id) {
              Session s = sessionfactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
      Accounttype actype = (Accounttype) s.get(Accounttype.class, id);
        t.commit();
        s.close();
        Gson g = new Gson();
        String subgson = g.toJson(actype);
        return actype;
    }
    
}
