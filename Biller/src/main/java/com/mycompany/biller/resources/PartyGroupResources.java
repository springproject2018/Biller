/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.resources;

import com.mycompany.biller.dto.Party;
import com.mycompany.biller.dto.PartyGroup;
import org.springframework.hateoas.ResourceSupport;

/**
 *
 * @author DELL
 */
public class PartyGroupResources extends ResourceSupport {

    private int partyGroupId;
    private String partyGroupCode;
    private String partyGroupName;
    private int partyId;
    private Party party;

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public int getPartyId() {
        return partyId;
    }

    public void setPartyId(int partyId) {
        this.partyId = partyId;
    }

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

    public PartyGroup toPartyGroup() {
        Party party = new Party();
        party.setPartyId(partyId);

        PartyGroup partyGroup = new PartyGroup();
        partyGroup.setPartyGroupId(partyGroupId);
        partyGroup.setPartyGroupCode(partyGroupCode);
        partyGroup.setPartyGroupName(partyGroupName);
        partyGroup.setParty(party);
        return partyGroup;
    }
}
