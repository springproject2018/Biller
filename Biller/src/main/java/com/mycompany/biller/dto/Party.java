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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PARTY_ID")
    private int partyId;

    @Column(name = "PARTY_CODE")
    private String partyCode;

    @Column(name = "PARTY_TYPE")
    private String partyType;
    // PARTY_GROUP => PartyGroup (biller)
    // PERSON => customer or any  

    @Column(name = "DESCRIPTIN")
    private String description;

    @Column(name = "PARENT_PARTY_ID")
    private int parentPartyId;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getParentPartyId() {
        return parentPartyId;
    }

    public void setParentPartyId(int parentPartyId) {
        this.parentPartyId = parentPartyId;
    }

    public int getPartyId() {
        return partyId;
    }

    public void setPartyId(int partyId) {
        this.partyId = partyId;
    }

    public String getPartyCode() {
        return partyCode;
    }

    public int getParentpartyId() {
        return parentPartyId;
    }

    public void setParentpartyId(int parentPartyId) {
        this.parentPartyId = parentPartyId;
    }

    public void setPartyCode(String partyCode) {
        this.partyCode = partyCode;
    }

    public String getPartyType() {
        return partyType;
    }

    public void setPartyType(String partyType) {
        this.partyType = partyType;
    }

    @Override
    public String toString() {
        return "Party{" + "partyId=" + partyId + ", partyCode=" + partyCode + ", partyType=" + partyType + ", description=" + description + ", parentPartyId=" + parentPartyId + '}';
    }

}
