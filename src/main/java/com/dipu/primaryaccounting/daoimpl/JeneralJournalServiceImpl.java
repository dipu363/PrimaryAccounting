/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipu.primaryaccounting.daoimpl;

import com.dipu.primaryaccounting.dao.JeneralJournalService;
import com.dipu.primaryaccounting.model.Demojournal;
import com.dipu.primaryaccounting.model.MasterJournal;
import com.dipu.primaryaccounting.model.SecondaryJournal;
import com.google.gson.Gson;
import java.util.List;
import java.util.Random;
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
public class JeneralJournalServiceImpl implements JeneralJournalService {

    @Autowired
    SessionFactory sf;

    @Override
    public String insertjournal(MasterJournal mj) {
        Session s = sf.openSession();
        Transaction t = s.getTransaction();
        t.begin();

        //if we get current user information then write this code . 
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (principal instanceof UserDetails) {

            String username = ((UserDetails) principal).getUsername();
            mj.setU_id(username);
        } else {

            String username = principal.toString();
            mj.setU_id(username);
        }
        SecondaryJournal secjournal = new SecondaryJournal();
        Demojournal demojournal = new Demojournal();

        
        if(mj.getDebit()!=0){
        secjournal.setM_id(mj.getM_id());
        secjournal.setDebit(mj.getDebit());
        secjournal.setCredit(mj.getDebit());
        secjournal.setAc_id(mj.getAc_id());
        }else{
        secjournal.setM_id(mj.getM_id());
        secjournal.setDebit(mj.getCredit());
        secjournal.setCredit(mj.getCredit()); 
        secjournal.setAc_id(mj.getAc_id());
        }
        
        s.save(mj);
        s.save(secjournal);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String updatejournal(MasterJournal mj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int genareterendom() {

        Random rand = new Random();
        int minRange = 999999, maxRange = 9999999;
        int rand_num = rand.nextInt(maxRange - minRange) + minRange;

        return rand_num;

    }

    @Override
    public String viewdemodetails() {
           Session s = sf.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        //if show data like status then write this coad ; or seccond line
        List<Demojournal> demolist = s.createQuery("from Demojournal").list();
       //  List<Accounttype> accountlist = s.createQuery("from Accounttype").list();
        Gson g = new Gson();
        String demojournaljson = g.toJson(demolist);
        t.commit();
        s.close();
        return demojournaljson;
    }

}
