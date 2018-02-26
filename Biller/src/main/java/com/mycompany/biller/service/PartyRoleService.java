/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.service;

import com.mycompany.biller.dto.PartyRole;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface PartyRoleService {

    public void addPartyRole(PartyRole partyRole);

    public void updatePartyRole(PartyRole partyRole);

    public void deletePartyRole(int partyRoleId);

    public List<PartyRole> listAllPartyRole();

    public List<PartyRole> findPartyRoleById(int partyRoleId);
}
