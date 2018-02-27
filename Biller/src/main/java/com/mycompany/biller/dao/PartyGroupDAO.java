/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.dao;

import com.mycompany.biller.dto.PartyGroup;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface PartyGroupDAO {

    public void addPartyGroup(PartyGroup partyGroup);

    public PartyGroup createPartyGroup(PartyGroup partyGroup);

    public void updatePartyGroup(PartyGroup partyGroup);

    public void deletePartyGroup(int partyGroupId);

    public List<PartyGroup> listAllPartyGroup();

    public List<PartyGroup> findPartyGroupById(int partyGroupId);

}
