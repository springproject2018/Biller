/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.resources;

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
        
        PartyGroup partyGroup = new PartyGroup();
        partyGroup.setPartyGroupId(partyGroupId);
        partyGroup.setPartyGroupCode(partyGroupCode);
        partyGroup.setPartyGroupName(partyGroupName);
        return partyGroup;
    }
}
