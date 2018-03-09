/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.resources;

import com.mycompany.biller.dto.Party;
import com.mycompany.biller.dto.PartyGroup;
import java.math.BigDecimal;
import org.springframework.hateoas.ResourceSupport;

/**
 *
 * @author DELL
 */
public class PartyResources extends ResourceSupport {
    
    private Party party;
    
    private String partyCode;
    private String partyType;
    private int partyId;
    private String description;
    
    public Party getParty() {
        return party;
    }
    
    public void setParty(Party party) {
        this.party = party;
    }
    
    public String getPartyCode() {
        return partyCode;
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
    
    public int getPartyId() {
        return partyId;
    }
    
    public void setPartyId(int partyId) {
        this.partyId = partyId;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Party toParty() {
        Party party = new Party();
        party.setPartyId(partyId);
        party.setDescription(description);
        party.setPartyCode(partyCode);
        party.setPartyType(partyType);
        return party;
    }
}
