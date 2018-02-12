/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.controller;

import com.mycompany.biller.dto.Party;
import com.mycompany.biller.dto.PartyType;
import com.mycompany.biller.dto.Person;
import com.mycompany.biller.dto.Type;
import com.mycompany.biller.service.PersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ismail
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    String add(@RequestParam(value = "fisrtName") String fisrtName,
            @RequestParam(value = "middleName") String middleName,
            @RequestParam(value = "lastName") String lastName,
            @RequestParam(value = "gender") char gender,
            @RequestParam(value = "partyId") int partyId) {

        Party party = new Party();
        party.setPartyId(partyId);

        Person person = new Person();
        person.setFisrtName(fisrtName);
        person.setMiddleName(middleName);
        person.setLastName(lastName);
        person.setGender(gender);
        person.setParty(party);
        personService.addPerson(person);
        return "OK";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public @ResponseBody
    String update(@RequestParam(value = "personId") int personId,
            @RequestParam(value = "fisrtName") String fisrtName,
            @RequestParam(value = "middleName") String middleName,
            @RequestParam(value = "lastName") String lastName,
            @RequestParam(value = "gender") char gender,
            @RequestParam(value = "partyId") int partyId) {

        Party party = new Party();
        party.setPartyId(partyId);

        Person person = new Person();
        person.setPersonId(personId);
        person.setFisrtName(fisrtName);
        person.setMiddleName(middleName);
        person.setLastName(lastName);
        person.setGender(gender);
        person.setParty(party);
        personService.updatePerson(person);
        return "OK";

    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public @ResponseBody
    String delete(@RequestParam(value = "personId") int personId) {

        personService.deletePerson(personId);
        return "OK";
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Person> listAll() {

        return personService.listAllPerson();

    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    @ResponseBody
    public List<Person> findById(@RequestParam(value = "personId") int personId) {
        return personService.findById(personId);

    }

}
