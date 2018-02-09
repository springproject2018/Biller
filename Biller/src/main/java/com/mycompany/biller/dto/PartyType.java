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
@Table(name = "PARTY_TYPE")
public class PartyType {

    @Id
    @Column(name = "PARTY_TYPE_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int partyTypeId;

    @Column(name = "DESCRIPTION")
    private String description;

    @ManyToOne
    private Party Party;

    @ManyToOne
    private Type type;

    public Party getParty() {
        return Party;
    }

    public void setParty(Party Party) {
        this.Party = Party;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getPartyTypeId() {
        return partyTypeId;
    }

    public void setPartyTypeId(int partyTypeId) {
        this.partyTypeId = partyTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "PartyType{" + "partyTypeId=" + partyTypeId + ", description=" + description + ", Party=" + Party + ", type=" + type + '}';
    }

}
