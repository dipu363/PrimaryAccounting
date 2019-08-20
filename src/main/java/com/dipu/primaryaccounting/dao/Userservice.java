/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipu.primaryaccounting.dao;

import com.dipu.primaryaccounting.model.User;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
public interface Userservice {
    
     public String acceptUser(User u);

    public String insertUser(User u);

    public String updateUser(User u);

    public String deleteUser(String email);

   public String viewUser();

    public User viewUser(String s);
    
    
    
}
