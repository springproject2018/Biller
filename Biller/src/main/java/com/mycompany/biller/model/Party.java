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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author ismail
 */
@Entity
@Table(name = "PARTY")
public class Party {

    @Id
    @Column(name = "PARTY_ID")
    private String partyId;

    @Column(name = "DESCRIPTIN")
    private String description;

    @ManyToOne
    private PartyType partyType;
    
    @OneToOne
    private Company company;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public PartyType getPartyType() {
        return partyType;
    }

    public void setPartyType(PartyType partyType) {
        this.partyType = partyType;
    }

    @Override
    public String toString() {
        return "Party{" + "partyId=" + partyId + ", description=" + description + ", partyType=" + partyType + '}';
    }

}
