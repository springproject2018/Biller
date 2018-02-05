///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.mycompany.biller.controller;
//
//import com.mycompany.biller.model.Party;
//import com.mycompany.biller.model.UserLogin;
//import com.mycompany.biller.service.PartyService;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// *
// * @author ismail
// */
//@RestController
//@RequestMapping(value = "/party")
//public class PartyController {
//
//    @Autowired
//    private PartyService partyService;
//
//    @RequestMapping(value = "/add", method = RequestMethod.POST)
//    public @ResponseBody
//    String add(@RequestParam(value = "partyId") String partyId,
//            @RequestParam(value = "firstName") String firstName,
//            @RequestParam(value = "lastName") String lastName) {
//        System.out.println("adeed");
//
//        Party party = new Party();
//        party.setPartyId(partyId);
//        party.setFirstName(firstName);
//        party.setLastName(lastName);
//
//        partyService.addParty(party);
//        return "OK";
//    }
//
//    @RequestMapping(value = "/update", method = RequestMethod.POST)
//    public @ResponseBody
//    String update(@RequestParam(value = "partyId") String partyId, @RequestParam(value = "firstName") String firstName, @RequestParam(value = "lastName") String lastName) {
//        System.out.println("updated");
//
//        Party party = new Party();
//        party.setPartyId(partyId);
//        party.setFirstName(firstName);
//        party.setLastName(lastName);
//
//        partyService.updateParty(party);
//
//        return "OK";
//    }
//
//    @RequestMapping(value = "/delete", method = RequestMethod.POST)
//    public @ResponseBody
//    String delete(@RequestParam(value = "partyId") String partyId) {
//        System.out.println("deleted");
//
//        partyService.deleteParty(partyId);
//        return "OK";
//    }
//
//    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
//    @ResponseBody
//    public List<Party> listAll() {
//
//        return partyService.listAllParty();
//
//    }
//
//    @RequestMapping(value = "/findById", method = RequestMethod.GET)
//    @ResponseBody
//    public List<Party> findById(@RequestParam(value = "partyId") String partyId) {
//        return partyService.findById(partyId);
//
//    }
//}
