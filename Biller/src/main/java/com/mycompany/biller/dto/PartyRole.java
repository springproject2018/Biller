/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "PARTY_ROLE")
public class PartyRole {

    @Id
    @Column(name = "PARTY_ROLE_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int partyRoleId;

    @Column(name = "DESCRIPTION")
    private String description;

    @ManyToOne
    private Party Party;

    @ManyToOne
    private RoleType roleType;

    public Party getParty() {
        return Party;
    }

    public void setParty(Party Party) {
        this.Party = Party;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public int getPartyRoleId() {
        return partyRoleId;
    }

    public void setPartyRoleId(int partyRoleId) {
        this.partyRoleId = partyRoleId;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "PartyType{" + "partyRoleId=" + partyRoleId + ", description=" + description + ", Party=" + Party + ", roleType=" + roleType + '}';
    }

}
