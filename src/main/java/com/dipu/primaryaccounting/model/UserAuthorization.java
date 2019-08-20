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
public class UserAuthorization implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ua_id;
    @Column
    private int u_id;
    @Column
    private int a_id;
    @Column
    private String form_name;
    @Column
    private String parmisson;
    @Column
    private String p_insert;
    @Column
    private String p_update;
    @Column
    private String p_delete;
    @Column
    private String status;

    public int getUa_id() {
        return ua_id;
    }

    public void setUa_id(int ua_id) {
        this.ua_id = ua_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public String getForm_name() {
        return form_name;
    }

    public void setForm_name(String form_name) {
        this.form_name = form_name;
    }

    public String getParmisson() {
        return parmisson;
    }

    public void setParmisson(String parmisson) {
        this.parmisson = parmisson;
    }

    public String getP_insert() {
        return p_insert;
    }

    public void setP_insert(String p_insert) {
        this.p_insert = p_insert;
    }

    public String getP_update() {
        return p_update;
    }

    public void setP_update(String p_update) {
        this.p_update = p_update;
    }

    public String getP_delete() {
        return p_delete;
    }

    public void setP_delete(String p_delete) {
        this.p_delete = p_delete;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
