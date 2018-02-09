/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.controller;

import com.mycompany.biller.dto.Type;
import com.mycompany.biller.service.TypeService;
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
@RestController
@RequestMapping(value = "/type")
public class TypeController {

    @Autowired
    private TypeService typeService;

    @CrossOrigin
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    String add(@RequestParam(value = "description") String description) {

        Type type = new Type();
        type.setDescription(description);
        typeService.addType(type);
        return "OK";
    }

    @CrossOrigin
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public @ResponseBody
    String update(@RequestParam(value = "typeID") int typeID,
            @RequestParam(value = "description") String description) {

        Type type = new Type();
        type.setTypeID(typeID);
        type.setDescription(description);
        typeService.updateType(type);
        return "OK";

    }

    @CrossOrigin
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public @ResponseBody
    String delete(@RequestParam(value = "typeID") int typeID) {

        typeService.deleteType(typeID);
        return "OK";
    }

    @CrossOrigin
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Type> listAll() {

        return typeService.listAllType();

    }

    @CrossOrigin
    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    @ResponseBody
    public List<Type> findById(@RequestParam(value = "typeID") int typeID) {
        return typeService.findById(typeID);

    }

}
