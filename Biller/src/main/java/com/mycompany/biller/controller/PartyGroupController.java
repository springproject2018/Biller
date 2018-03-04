/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.controller;

import com.mycompany.biller.dto.PartyGroup;
import com.mycompany.biller.dto.Party;
import com.mycompany.biller.resources.PartyGroupResources;
import com.mycompany.biller.resources.UserLoginRoleQuery;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.mycompany.biller.service.PartyGroupService;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ismail
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/partyGroup")
public class PartyGroupController {

    @Autowired
    private PartyGroupService partyGroupService;


    @RequestMapping(value = "/createPartyGroup", method = RequestMethod.POST)
    public ResponseEntity<Map<String,Object>> createPartyGroup(@RequestBody PartyGroupResources partyGroupResources) {
        System.out.println("*** createCompany ***");

        PartyGroup partyGroup = partyGroupService.createPartyGroup(partyGroupResources.toPartyGroup());
        System.out.println("partyGroup "+partyGroup);
        HashMap <String,Object> result = new HashMap<String,Object>();
   result.put("partyGroupId",partyGroup.getPartyGroupId());
    result.put("status",HttpStatus.NOT_FOUND);
     result.put("msg","created successfully");
     
    return new ResponseEntity<Map<String,Object>>(result, HttpStatus.NOT_FOUND);
   
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public @ResponseBody
    String update(@RequestParam(value = "partyGroupId") int partyGroupId,
            @RequestParam(value = "partyGroupName") String partyGroupName,
            @RequestParam(value = "partyGroupCode") String partyGroupCode,
            @RequestParam(value = "partyId") int partyId) {
        
        Party party = new Party();
        party.setPartyId(partyId);

        PartyGroup partyGroup = new PartyGroup();
        partyGroup.setPartyGroupId(partyGroupId);
        partyGroup.setPartyGroupCode(partyGroupCode);
        partyGroup.setPartyGroupName(partyGroupName);
        partyGroup.setParty(party);

        partyGroupService.updatePartyGroup(partyGroup);
        return "OK";

    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public @ResponseBody
    String delete(@RequestParam(value = "partyGroupId") int partyGroupId) {

        partyGroupService.deletePartyGroup(partyGroupId);
        return "OK";
    }

    @RequestMapping(value = "/listAllPartyGroup", method = RequestMethod.GET)
    @ResponseBody
    public List<PartyGroup> listAllPartyGroup() {

        return partyGroupService.listAllPartyGroup();
    }

    @RequestMapping(value = "/findPartyGroupById", method = RequestMethod.GET)
    @ResponseBody
    public List<PartyGroup> findPartyGroupById(@RequestParam(value = "partyGroupId") int partyGroupId) {
        return partyGroupService.findPartyGroupById(partyGroupId);

    }

}
