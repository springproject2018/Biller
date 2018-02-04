/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.DAO;

import com.mycompany.biller.model.PartyType;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface PartyTypeDAO {

    public void addPartyType(PartyType partyType);

    public void updatePartyType(PartyType partyType);

    public void deletePartyType(String partyTypeId);

    public List<PartyType> listAllPartyType();

    public List<PartyType> findById(String partyTypeId);
}
