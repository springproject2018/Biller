/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.serviceImpl;

import com.mycompany.biller.DAO.PartyDAO;
import com.mycompany.biller.model.Party;
import com.mycompany.biller.service.PartyService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ismail
 */
@Service
@Transactional
public class PartyServiceImpl implements PartyService {
    
    @Autowired
    private PartyDAO partyDAO;

   
    
    @Override
    public void addParty(Party party) {
        partyDAO.addParty(party);
    }
    
    @Override
    public void updateParty(Party party) {
        partyDAO.updateParty(party);
    }
    
    @Override
    public void deleteParty(String partyId) {
        partyDAO.deleteParty(partyId);
    }
    
    @Override
    public List<Party> listAllParty() {
        return partyDAO.listAllParty();
    }
    
    @Override
    public List<Party> findById(String partyId) {
        return partyDAO.findById(partyId);
    }
    
}
