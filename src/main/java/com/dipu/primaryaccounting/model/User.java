package com.dipu.primaryaccounting.model;
// Generated Nov 20, 2018 3:22:38 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * User generated by hbm2java
 */
@Entity

public class User implements java.io.Serializable {

    @Id
    private String emailid;
    @Column
    private String phone;
    @Column
    private String username;
   @Column
    private String password;
    @Transient
    String userrole;


    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserrole() {
        return userrole;
    }

    public void setUserrole(String userrole) {
        this.userrole = userrole;
    }
    
   
}
