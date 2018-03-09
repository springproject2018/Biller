/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.controller;

import com.mycompany.biller.dto.PartyGroup;
import com.mycompany.biller.dto.Party;
import com.mycompany.biller.resources.PartyGroupResources;
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
import com.mycompany.biller.service.PartyService;

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
    
    @Autowired
    private PartyService partyService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    String add(@RequestParam(value = "partyId") int partyId,
            @RequestParam(value = "partyGroupName") String partyGroupName,
            @RequestParam(value = "partyGroupCode") String partyGroupCode) {
        Party party = new Party();
        party.setPartyId(partyId);
        
        PartyGroup partyGroup = new PartyGroup();
        partyGroup.setPartyGroupCode(partyGroupCode);
        partyGroup.setPartyGroupName(partyGroupName);
        partyGroup.setParty(party);
        partyGroupService.addPartyGroup(partyGroup);
        return "OK";
    }

    @RequestMapping(value = "/createPartyGroup", method = RequestMethod.POST)
    public ResponseEntity<PartyGroupResources> createPartyGroup(@RequestBody PartyGroupResources partyGroupResources) {
        System.out.println("*** createCompany ***");

        PartyGroup partyGroup = partyGroupService.createPartyGroup(partyGroupResources.toPartyGroup());
        partyGroupResources.setPartyGroupId(partyGroup.getPartyGroupId());
        partyGroupResources.setPartyGroupCode(partyGroup.getPartyGroupCode());
        partyGroupResources.setPartyGroupName(partyGroup.getPartyGroupName());
        partyGroupResources.setParty(partyGroup.getParty());

        partyGroupResources.setPartyTaxId(partyGroup.getPartyTaxId());
//        partyGroupResources.setPartyType(partyGroup.getPartyType());
        partyGroupResources.setCommericalRegistrationNum(partyGroup.getCommericalRegistrationNum());
        partyGroupResources.setPartyActivity(partyGroup.getPartyActivity());
        partyGroupResources.setPartyCapital(partyGroup.getPartyCapital());
        partyGroupResources.setPartySize(partyGroup.getPartySize());
        partyGroupResources.setMailBox(partyGroup.getMailBox());
        partyGroupResources.setMobileNumber(partyGroup.getMobileNumber());
        partyGroupResources.setMonthlyInvoicingRate(partyGroup.getMonthlyInvoicingRate());
        partyGroupResources.setPostalCode(partyGroup.getPostalCode());
        partyGroupResources.setTelephoneNumber1(partyGroup.getTelephoneNumber1());
        partyGroupResources.setTelephoneNumber2(partyGroup.getTelephoneNumber2());

        return new ResponseEntity<PartyGroupResources>(partyGroupResources, HttpStatus.CREATED);
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
