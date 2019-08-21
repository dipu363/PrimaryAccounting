/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipu.primaryaccounting.dao;

import com.dipu.primaryaccounting.model.AccountChart;
import org.springframework.stereotype.Service;

/**
 *
 * @author SKY IT
 */
@Service
public interface AccountHeadService {
       public String insertAccounthead(AccountChart head);

    public String updateAccounthead(AccountChart head);

    public String deleteAccounthead(int id);

    public String viewAccounthead();

    public AccountChart viewoneAccounthead(int id);

}
