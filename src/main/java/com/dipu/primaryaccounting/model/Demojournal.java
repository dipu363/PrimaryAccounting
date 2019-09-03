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
public class Demojournal implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)       
    private int demoid;
    @Column
    private String demovouchertype;
    @Column
    private String demoacchead;
    @Column
    private double demodebittk;
    @Column
    private double democredittk;

    public int getDemoid() {
        return demoid;
    }

    public void setDemoid(int demoid) {
        this.demoid = demoid;
    }

    public String getDemovouchertype() {
        return demovouchertype;
    }

    public void setDemovouchertype(String demovouchertype) {
        this.demovouchertype = demovouchertype;
    }

    public String getDemoacchead() {
        return demoacchead;
    }

    public void setDemoacchead(String demoacchead) {
        this.demoacchead = demoacchead;
    }

    public double getDemodebittk() {
        return demodebittk;
    }

    public void setDemodebittk(double demodebittk) {
        this.demodebittk = demodebittk;
    }

    public double getDemocredittk() {
        return democredittk;
    }

    public void setDemocredittk(double democredittk) {
        this.democredittk = democredittk;
    }


    
}
