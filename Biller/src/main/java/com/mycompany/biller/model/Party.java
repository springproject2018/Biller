/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
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
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PARTY_ID")
    private String partyId;

    @OneToOne
    private Person person;

    @OneToOne
    private PartyType partyType;

    @OneToOne
    private Company company;

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public PartyType getPartyType() {
        return partyType;
    }

    public void setPartyType(PartyType partyType) {
        this.partyType = partyType;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Party{" + "partyId=" + partyId + ", person=" + person + ", partyType=" + partyType + ", company=" + company + '}';
    }
    
    

}
