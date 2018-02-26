/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.controller;

import com.mycompany.biller.dto.Component;
import com.mycompany.biller.dto.Menus;
import com.mycompany.biller.dto.Party;
import com.mycompany.biller.dto.PartyRole;
import com.mycompany.biller.dto.RoleType;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.mycompany.biller.service.PartyRoleService;

/**
 *
 * @author ismail
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/partyRole")
public class PartyRoleController {

    @Autowired
    private PartyRoleService partyRoleService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    String add(@RequestParam(value = "description") String description,
            @RequestParam(value = "partyId") int partyId,
            @RequestParam(value = "roleTypeID") int roleTypeID) {

        Party party = new Party();
        party.setPartyId(partyId);

        RoleType roleType = new RoleType();
        roleType.setRoleTypeID(roleTypeID);

        PartyRole partyRole = new PartyRole();
        partyRole.setDescription(description);
        partyRole.setParty(party);
        partyRole.setRoleType(roleType);
        partyRoleService.addPartyRole(partyRole);
        return "OK";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public @ResponseBody
    String update(@RequestParam(value = "partyRoleId") int partyRoleId,
            @RequestParam(value = "description") String description,
            @RequestParam(value = "partyId") int partyId,
            @RequestParam(value = "roleTypeID") int roleTypeID) {

        Party party = new Party();
        party.setPartyId(partyId);

        RoleType roleType = new RoleType();
        roleType.setRoleTypeID(roleTypeID);

        PartyRole partyRole = new PartyRole();
        partyRole.setPartyRoleId(partyRoleId);
        partyRole.setDescription(description);
        partyRole.setParty(party);
        partyRole.setRoleType(roleType);
        partyRoleService.updatePartyRole(partyRole);
        return "OK";

    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public @ResponseBody
    String delete(@RequestParam(value = "partyRoleId") int partyRoleId) {

        partyRoleService.deletePartyRole(partyRoleId);
        return "OK";
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public List<PartyRole> listAll() {

        return partyRoleService.listAllPartyRole();

    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    @ResponseBody
    public List<PartyRole> findById(@RequestParam(value = "partyRoleId") int partyRoleId) {
        return partyRoleService.findPartyRoleById(partyRoleId);

    }

}
