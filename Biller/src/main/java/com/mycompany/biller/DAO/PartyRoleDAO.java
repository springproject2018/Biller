/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.DAO;

import com.mycompany.biller.model.Party;
import com.mycompany.biller.model.PartyRole;
import java.util.List;

/**
 *
 * @author ismail
 */
public interface PartyRoleDAO {
    public void addPartyRole(PartyRole partyRole);

    public void updatePartyRole(PartyRole partyRole);

    public void deletePartyRole(int partyRoleId);

    public List<PartyRole> listAllPartyRole();

    public List<PartyRole> findById(int partyRoleId);
}
