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

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    String add(@RequestParam(value = "partyGroupName") String partyGroupName,
            @RequestParam(value = "partyGroupCode") String partyGroupCode) {

        PartyGroup partyGroup = new PartyGroup();
        partyGroup.setPartyGroupCode(partyGroupCode);
        partyGroup.setPartyGroupName(partyGroupName);
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

        return new ResponseEntity<PartyGroupResources>(partyGroupResources, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public @ResponseBody
    String update(@RequestParam(value = "partyGroupId") int partyGroupId,
            @RequestParam(value = "partyGroupName") String partyGroupName,
            @RequestParam(value = "partyGroupCode") String partyGroupCode) {

        PartyGroup partyGroup = new PartyGroup();
        partyGroup.setPartyGroupId(partyGroupId);
        partyGroup.setPartyGroupCode(partyGroupCode);
        partyGroup.setPartyGroupName(partyGroupName);

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
