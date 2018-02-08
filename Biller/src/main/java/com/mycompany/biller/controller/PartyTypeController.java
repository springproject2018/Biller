/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.controller;

import com.mycompany.biller.model.Component;
import com.mycompany.biller.model.Menus;
import com.mycompany.biller.model.Party;
import com.mycompany.biller.model.PartyType;
import com.mycompany.biller.model.Type;
import com.mycompany.biller.service.PartyTypeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ismail
 */
@RestController
@RequestMapping(value = "/partyType")
public class PartyTypeController {

    @Autowired
    private PartyTypeService partyTypeService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    String add(@RequestParam(value = "description") String description,
            @RequestParam(value = "partyId") int partyId,
            @RequestParam(value = "typeID") int typeID) {

        Party party = new Party();
        party.setPartyId(partyId);

        Type type = new Type();
        type.setTypeID(typeID);

        PartyType partyType = new PartyType();
        partyType.setDescription(description);
        partyType.setParty(party);
        partyType.setType(type);
        partyTypeService.addPartyType(partyType);
        return "OK";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public @ResponseBody
    String update(@RequestParam(value = "partyTypeId") int partyTypeId,
            @RequestParam(value = "description") String description,
            @RequestParam(value = "partyId") int partyId,
            @RequestParam(value = "typeID") int typeID) {

        Party party = new Party();
        party.setPartyId(partyId);

        Type type = new Type();
        type.setTypeID(typeID);

        PartyType partyType = new PartyType();
        partyType.setPartyTypeId(partyTypeId);
        partyType.setDescription(description);
        partyType.setParty(party);
        partyType.setType(type);
        partyTypeService.updatePartyType(partyType);
        return "OK";

    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public @ResponseBody
    String delete(@RequestParam(value = "partyTypeId") int partyTypeId) {

        partyTypeService.deletePartyType(partyTypeId);
        return "OK";
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public List<PartyType> listAll() {

        return partyTypeService.listAllPartyType();

    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    @ResponseBody
    public List<PartyType> findById(@RequestParam(value = "partyTypeId") int partyTypeId) {
        return partyTypeService.findById(partyTypeId);

    }

}
