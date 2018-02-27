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
 * @author Admin
 */
@Entity
@Table(name = "PARTY_GROUP")
public class PartyGroup {

    @Id
    @Column(name = "PARTY_GROUP_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int partyGroupId;

    @Column(name = "PARTY_GROUP_CODE")
    private String partyGroupCode;

    @Column(name = "PARTY_GROUP_NAME")
    private String partyGroupName;

    public int getPartyGroupId() {
        return partyGroupId;
    }

    public void setPartyGroupId(int partyGroupId) {
        this.partyGroupId = partyGroupId;
    }

    public String getPartyGroupCode() {
        return partyGroupCode;
    }

    public void setPartyGroupCode(String partyGroupCode) {
        this.partyGroupCode = partyGroupCode;
    }

    public String getPartyGroupName() {
        return partyGroupName;
    }

    public void setPartyGroupName(String partyGroupName) {
        this.partyGroupName = partyGroupName;
    }

    @Override
    public String toString() {
        return "PartyGroup{" + "partyGroupId=" + partyGroupId + ", partyGroupCode=" + partyGroupCode + ", partyGroupName=" + partyGroupName + '}';
    }

}
