/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.service;

import com.mycompany.biller.model.Party;
import com.mycompany.biller.model.Users;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface PartyService {
    
    public void addParty(Party party);

    public void updateParty(Party party);

    public void deleteParty(String partyId);

    public List<Party> listAllParty();

    public List<Party> findById(String partyId);
    
}
