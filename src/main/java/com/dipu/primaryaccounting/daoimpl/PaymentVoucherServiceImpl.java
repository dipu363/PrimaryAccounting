/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipu.primaryaccounting.daoimpl;

import com.dipu.primaryaccounting.dao.PaymentVoucherService;
import com.dipu.primaryaccounting.model.MasteJournal;
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
public class PaymentVoucherServiceImpl implements PaymentVoucherService{
    @Autowired
SessionFactory sf;
    @Override
    public String insertpaymet(MasteJournal mj) {
        Session s = sf.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        s.save(mj);
        t.commit();
        s.close();
        return null;
        
        
    }

    @Override
    public String updatepayment(MasteJournal mj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
