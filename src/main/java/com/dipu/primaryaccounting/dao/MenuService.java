/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipu.primaryaccounting.dao;

import com.dipu.primaryaccounting.model.UserMenu;
import org.springframework.stereotype.Service;

/**
 *
 * @author SKY IT
 */
@Service
public interface MenuService {
      public String insertMenu(UserMenu menu);

    public String updateMenu(UserMenu menu);

    public String deleteMenu(int id);

   public String viewMenu();

    public UserMenu viewoneMenu(int id);
}
