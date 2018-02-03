/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.DAO;

import com.mycompany.biller.model.Menus;
import com.mycompany.biller.model.Party;
import java.util.List;

/**
 *
 * @author ismail
 */
public interface PartyDAO {
    
    public void addParty(Party party);

    public void updateParty(Party party);

    public void deleteParty(String partyId);

    public List<Party> listAllParty();

    public List<Party> findById(String partyId);
    
    
}
