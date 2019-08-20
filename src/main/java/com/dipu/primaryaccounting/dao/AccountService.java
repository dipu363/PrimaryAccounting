/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipu.primaryaccounting.dao;

import com.dipu.primaryaccounting.model.Accounttype;
import org.springframework.stereotype.Service;

/**
 *
 * @author SKY IT
 */
@Service
public interface AccountService {

    public String insertAccounttype(Accounttype actype);

    public String updateAccounttype(Accounttype actype);

    public String deleteAccounttype(int id);

    public String viewAccounttype();

    public Accounttype viewoneAccounttype(int id);

}
