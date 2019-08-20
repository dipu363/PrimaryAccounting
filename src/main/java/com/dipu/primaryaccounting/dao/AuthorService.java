/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipu.primaryaccounting.dao;

import com.dipu.primaryaccounting.model.Author;
import org.springframework.stereotype.Service;

/**
 *
 * @author SKY IT
 */
@Service
public interface AuthorService {
    public String insertAuthor(Author author);

    public String updateAuthor(Author author);

    public String deleteAuthor(int id);

   public String viewAuthor();

    public Author  viewoneAuthor(int id);
    
}
