/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipu.primaryaccounting.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author SKY IT
 */
@Entity
public class MasterJournal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int m_id;
    @Column
    private String u_id;
    @Column
    private int company_id;
    @Column
    private String voucher_no;
    @Temporal(TemporalType.DATE)
    private Date tancsectiondate;
    @Column
    private String voucher_type;
    @Column
    private String narration;
    @Transient
    private int ac_id;
    @Transient
    private double debit;
    @Transient
    private double credit;
    @Transient
    private String sec_status;

    public String getSec_status() {
        return sec_status;
    }

    public void setSec_status(String sec_status) {
        this.sec_status = sec_status;
    }

    public String getU_id() {
        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    public Date getTancsectiondate() {
        return tancsectiondate;
    }

    public void setTancsectiondate(Date tancsectiondate) {
        this.tancsectiondate = tancsectiondate;
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

    public int getM_id() {
        return m_id;
    }

    public int getAc_id() {
        return ac_id;
    }

    public void setAc_id(int ac_id) {
        this.ac_id = ac_id;
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

    public String getVoucher_no() {
        return voucher_no;
    }

    public void setVoucher_no(String voucher_no) {
        this.voucher_no = voucher_no;
    }

    public String getVoucher_type() {
        return voucher_type;
    }

    public void setVoucher_type(String voucher_type) {
        this.voucher_type = voucher_type;
    }

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }

}
