/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.service;

import com.mycompany.biller.DAO.*;
import com.mycompany.biller.model.PartyType;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface PartyTypeService {

    public void addPartyType(PartyType partyType);

    public void updatePartyType(PartyType partyType);

    public void deletePartyType(int partyTypeId);

    public List<PartyType> listAllPartyType();

    public List<PartyType> findById(int partyTypeId);
}
