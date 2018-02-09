/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.service;

import com.mycompany.biller.dto.Party;
import java.util.List;

/**
 *
 * @author ismail
 */
public interface PartyService {
    
    public void addParty(Party party);

    public void updateParty(Party party);

    public void deleteParty(int partyId);

    public List<Party> listAllParty();

    public List<Party> findById(int partyId);
    
    
}
