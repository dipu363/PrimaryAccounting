/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipu.primaryaccounting.daoimpl;

import com.dipu.primaryaccounting.dao.AuthorService;
import com.dipu.primaryaccounting.model.Author;
import com.google.gson.Gson;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

/**
 *
 * @author SKY IT
 */
@Repository
public class AuthorServiceImpl implements AuthorService{
@Autowired 
SessionFactory sessionfactory;
    @Override
    public String insertAuthor(Author author) {
     Session s = sessionfactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        s.save(author);
        t.commit();
        s.close();
       return null; 
    }

    @Override
    public String updateAuthor(Author author) {
        
        Session s = sessionfactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        s.update(author);
        t.commit();
        s.close();
       return null;
       
       
    }
    @Override
    public String viewAuthor() {
     Session s = sessionfactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        List<Author> grouplist = s.createQuery("from Author").list();
        Gson g = new Gson();
        String authorlistgson = g.toJson(grouplist);
        t.commit();
        s.close();
       
        return authorlistgson;
    }

 

    @Override
    public String deleteAuthor(int id) {
     
          Session s = sessionfactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
        Author auhtor = (Author) s.get(Author.class, id);
        s.delete(auhtor);
        t.commit();
        s.close();

        return null;
 
    }

    @Override
    public Author viewoneAuthor(int id) {
            Session s = sessionfactory.openSession();
        Transaction t = s.getTransaction();
        t.begin();
      Author author = (Author) s.get(Author.class, id);
        t.commit();
        s.close();
        Gson g = new Gson();
        String subgson = g.toJson(author);
        return author;
    }
    
}
