/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.serviceImpl;

import com.mycompany.biller.dao.PartyTypeDAO;
import com.mycompany.biller.dto.PartyType;
import com.mycompany.biller.service.PartyTypeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Admin
 */
@Service
@Transactional
public class PartyTypeServiceImpl implements PartyTypeService {

    @Autowired
    private PartyTypeDAO partyTypeDAO;

    @Override
    public void addPartyType(PartyType partyType) {
        partyTypeDAO.addPartyType(partyType);
    }

    @Override
    public void updatePartyType(PartyType partyType) {
        partyTypeDAO.updatePartyType(partyType);
    }

    @Override
    public void deletePartyType(int partyTypeId) {
        partyTypeDAO.deletePartyType(partyTypeId);
    }

    @Override
    public List<PartyType> listAllPartyType() {
       return partyTypeDAO.listAllPartyType();
    }

    @Override
    public List<PartyType> findById(int partyTypeId) {
       return partyTypeDAO.findById(partyTypeId);
    }

   





 
  




   

  

}
