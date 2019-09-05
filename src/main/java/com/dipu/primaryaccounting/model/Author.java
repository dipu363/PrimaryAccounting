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
public class Author implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int  a_id;
    @Column
    private String author_name; 
    @Column
    private String author_type;
    @Column
    private String author_status="Active";



    public Author() {
    }
    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getAuthor_type() {
        return author_type;
    }

    public void setAuthor_type(String author_type) {
        this.author_type = author_type;
    }

    public String getAuthor_status() {
        return author_status;
    }

    public void setAuthor_status(String author_status) {
        this.author_status = author_status;
    }
    
}
