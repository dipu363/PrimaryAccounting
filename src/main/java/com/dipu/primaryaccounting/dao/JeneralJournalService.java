/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dipu.primaryaccounting.dao;

import com.dipu.primaryaccounting.model.MasterJournal;
import org.springframework.stereotype.Service;

/**
 *
 * @author SKY IT
 */
@Service
public interface JeneralJournalService {

    public String insertjournal(MasterJournal mj);

    public String updatejournal(MasterJournal mj);
    public String viewdemodetails();

    public int genareterendom();
}
