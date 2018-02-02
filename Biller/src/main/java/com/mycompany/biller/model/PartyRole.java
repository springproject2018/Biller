/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author ismail
 */
@Entity
@Table(name = "PARTY_ROLE")
public class PartyRole {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PARTY_ROLE_ID")
    private int partyRoleId;
    
    @OneToOne
    private Party party;
    
    @OneToOne
    private Role role;

    public int getPartyRoleId() {
        return partyRoleId;
    }

    public void setPartyRoleId(int partyRoleId) {
        this.partyRoleId = partyRoleId;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "PartyRole{" + "partyRoleId=" + partyRoleId + ", party=" + party + ", role=" + role + '}';
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    
    
}
