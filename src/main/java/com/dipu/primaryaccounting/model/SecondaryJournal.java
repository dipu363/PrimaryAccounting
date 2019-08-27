/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipu.primaryaccounting.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author SKY IT
 */
@Entity
public class SecondaryJournal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sec_id;
    @Column
    private int u_id;
    @Column
    private int m_id;
    @Column
    private int company_id;
    @Column
    private int ac_id;
    @Column
    private double debit;
    @Column
    private double credit;
    @Column
    private String sec_status;

    public String getSec_status() {
        return sec_status;
    }

    public void setSec_status(String sec_status) {
        this.sec_status = sec_status;
    }

    public int getSec_id() {
        return sec_id;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public void setSec_id(int sec_id) {
        this.sec_id = sec_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public int getAc_id() {
        return ac_id;
    }

    public void setAc_id(int ac_id) {
        this.ac_id = ac_id;
    }
 

}
