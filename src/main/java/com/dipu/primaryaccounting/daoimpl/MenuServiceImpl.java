/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipu.primaryaccounting.daoimpl;

import com.dipu.primaryaccounting.dao.MenuService;
import com.dipu.primaryaccounting.model.UserMenu;
import com.google.gson.Gson;
import java.util.List;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author SKY IT
 */
@Repository
public class MenuServiceImpl implements MenuService {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public String insertMenu(UserMenu menu) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        s.save(menu);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String updateMenu(UserMenu menu) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        s.update(menu);
        t.commit();
        s.close();
        return null;

    }

    @Override
    public String deleteMenu(int id) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();

        UserMenu menuid = (UserMenu) s.get(UserMenu.class, id);
        s.delete(menuid);
        t.commit();
        s.close();
        return null;
    }

    @Override
    public String viewMenu() {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        List<UserMenu> allMenu = s.createQuery("from UserMenu").list();
        Gson g =new Gson();
        String jsonallmenu = g.toJson(allMenu);
        t.commit();
        s.close();
        

return jsonallmenu;
    }

    @Override
    public UserMenu viewoneMenu(int id) {
        Session s = sessionFactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        UserMenu menu = (UserMenu) s.get(UserMenu.class, id);
        Gson g = new Gson();
        String onemenu = g.toJson(menu);

        t.commit();
        s.close();
        return menu;
    }

}
