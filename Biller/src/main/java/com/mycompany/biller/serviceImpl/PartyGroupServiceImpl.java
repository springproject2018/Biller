/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.serviceImpl;

import com.mycompany.biller.dto.PartyGroup;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.mycompany.biller.dao.PartyGroupDAO;
import com.mycompany.biller.service.PartyGroupService;

/**
 *
 * @author ismail
 */
@Service
@Transactional
public class PartyGroupServiceImpl implements PartyGroupService {

    @Autowired
    private PartyGroupDAO partyGroupDAO;

    @Override
    public void addPartyGroup(PartyGroup partyGroup) {
        partyGroupDAO.addPartyGroup(partyGroup);
    }

    @Override
    public void updatePartyGroup(PartyGroup partyGroup) {
        partyGroupDAO.updatePartyGroup(partyGroup);
    }

    @Override
    public void deletePartyGroup(int partyGroupId) {
        partyGroupDAO.deletePartyGroup(partyGroupId);
    }

    @Override
    public List<PartyGroup> listAllPartyGroup() {
        return partyGroupDAO.listAllPartyGroup();
    }

    @Override
    public List<PartyGroup> findPartyGroupById(int partyGroupId) {
        return partyGroupDAO.findPartyGroupById(partyGroupId);
    }

    @Override
    public PartyGroup createPartyGroup(PartyGroup partyGroup) {
        return partyGroupDAO.createPartyGroup(partyGroup);
    }

}
