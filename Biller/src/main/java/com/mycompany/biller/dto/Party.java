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

    @Column(name = "DESCRIPTIN")
    private String description;

    @Column(name = "PARENT_PARTY_ID")
    private String parentPartyId;

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

    public int getPartyId() {
        return partyId;
    }

    public void setPartyId(int partyId) {
        this.partyId = partyId;
    }

    public String getPartyCode() {
        return partyCode;
    }

    public String getParentpartyId() {
        return parentPartyId;
    }

    public void setParentpartyId(String parentPartyId) {
        this.parentPartyId = parentPartyId;
    }

    public void setPartyCode(String partyCode) {
        this.partyCode = partyCode;
    }

    @Override
    public String toString() {
        return "Party{" + "partyId=" + partyId + ", partyCode=" + partyCode + ", description=" + description + ", parentPartyId=" + parentPartyId + ", company=" + company + '}';
    }

}
