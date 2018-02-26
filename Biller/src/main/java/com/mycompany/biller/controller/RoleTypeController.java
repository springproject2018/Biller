/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.controller;

import com.mycompany.biller.dto.RoleType;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.mycompany.biller.service.RoleTypeService;

/**
 *
 * @author ismail
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/roleType")
public class RoleTypeController {

    @Autowired
    private RoleTypeService typeService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    String add(@RequestParam(value = "parentRoleTypeID") String parentRoleTypeID,
            @RequestParam(value = "description") String description) {

        RoleType type = new RoleType();
        type.setParentRoleTypeID(parentRoleTypeID);
        type.setDescription(description);
        typeService.addRoleType(type);
        return "OK";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public @ResponseBody
    String update(@RequestParam(value = "roleTypeID") int roleTypeID,
            @RequestParam(value = "parentRoleTypeID") String parentRoleTypeID,
            @RequestParam(value = "description") String description) {

        RoleType type = new RoleType();
        type.setRoleTypeID(roleTypeID);
        type.setParentRoleTypeID(parentRoleTypeID);
        type.setDescription(description);
        typeService.updateRoleType(type);
        return "OK";

    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public @ResponseBody
    String delete(@RequestParam(value = "typeID") int typeID) {

        typeService.deleteRoleType(typeID);
        return "OK";
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public List<RoleType> listAll() {

        return typeService.listAllRoleType();

    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    @ResponseBody
    public List<RoleType> findById(@RequestParam(value = "roleTypeID") int roleTypeID) {
        return typeService.findRoleTypeById(roleTypeID);

    }

}
