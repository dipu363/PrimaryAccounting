/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipu.primaryaccounting.daoimpl;

import com.dipu.primaryaccounting.dao.RecivedVoucherService;
import com.dipu.primaryaccounting.model.MasterJournal;
import com.dipu.primaryaccounting.model.SecondaryJournal;
import com.google.gson.Gson;
import java.sql.ResultSet;
import java.util.List;
import org.hibernate.Query;
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
public class RecivedVoucherServiceImpl implements RecivedVoucherService {
    @Autowired
SessionFactory sf;
    @Override
    public String insertrecived(MasterJournal mj) {
               Session s = sf.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        SecondaryJournal  secjournal = new SecondaryJournal();
        secjournal.setM_id(mj.getM_id());
        secjournal.setDebit(mj.getCredit());
        secjournal.setCredit(mj.getCredit());
        secjournal.setAc_id(mj.getAc_id());
        s.save(mj);
        s.save(secjournal);
        t.commit();
        s.close();
        return null; 
    }

    @Override
    public String updaterecived(MasterJournal mj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String  allrowcount() {
       
                 Session s = sf.openSession();
        Transaction t = s.getTransaction();
        t.begin();  
        
      
          List<MasterJournal> allrows = s.createQuery("select count(m_id) from MasterJournal").list();
        
        Gson g = new Gson();
        String accountlistgson = g.toJson(allrows);
        t.commit();
        s.close();
        return accountlistgson;
    }
    
}
