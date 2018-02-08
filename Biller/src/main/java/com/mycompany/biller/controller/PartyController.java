/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.controller;

import com.mycompany.biller.model.Company;
import com.mycompany.biller.model.Party;
import com.mycompany.biller.service.PartyService;
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
@RequestMapping(value = "/party")
public class PartyController {

    @Autowired
    private PartyService partyService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    String add(@RequestParam(value = "partyId") int partyId,
            @RequestParam(value = "desc") String desc,
            @RequestParam(value = "partyCode") String partyCode,
            @RequestParam(value = "comId") int comId) {

        Company company = new Company();
        company.setCompanyId(comId);

        Party party = new Party();
        party.setPartyId(partyId);
        party.setDescription(desc);
        party.setPartyCode(partyCode);
        party.setCompany(company);
        partyService.addParty(party);
        return "OK";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public @ResponseBody
    String update(@RequestParam(value = "partyId") int partyId,
            @RequestParam(value = "desc") String desc,
            @RequestParam(value = "partyCode") String partyCode,
            @RequestParam(value = "comId") int comId) {
        Company company = new Company();
        company.setCompanyId(comId);

        Party party = new Party();
        party.setPartyId(partyId);
        party.setDescription(desc);
        party.setPartyCode(partyCode);
        party.setCompany(company);
        partyService.updateParty(party);
        return "OK";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public @ResponseBody
    String delete(@RequestParam(value = "partyId") int partyId) {
        System.out.println("deleted");

        partyService.deleteParty(partyId);
        return "OK";
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Party> listAll() {

        return partyService.listAllParty();

    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    @ResponseBody
    public List<Party> findById(@RequestParam(value = "partyId") int partyId) {
        return partyService.findById(partyId);

    }
}
