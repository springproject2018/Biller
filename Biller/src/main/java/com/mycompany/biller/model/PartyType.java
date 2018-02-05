/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
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
    private String partyTypeId;

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

    public String getPartyTypeId() {
        return partyTypeId;
    }

    public void setPartyTypeId(String partyTypeId) {
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
