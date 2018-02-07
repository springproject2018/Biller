/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.controller;

import com.mycompany.biller.model.Party;
import com.mycompany.biller.model.Person;
import com.mycompany.biller.model.RoleGroup;
import com.mycompany.biller.service.RoleGroupService;
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
@RequestMapping(value = "/roleGroup")
public class RoleGroupController {

    @Autowired
    private RoleGroupService roleGroupService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    String add(@RequestParam(value = "description") String description) {

        RoleGroup roleGroup = new RoleGroup();
        roleGroup.setDescription(description);
        roleGroupService.addRoleGroup(roleGroup);
        return "OK";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public @ResponseBody
    String update(@RequestParam(value = "roleGroupId") int roleGroupId,
            @RequestParam(value = "description") String description) {

        RoleGroup roleGroup = new RoleGroup();
        roleGroup.setRoleGroupId(roleGroupId);
        roleGroup.setDescription(description);
        roleGroupService.updateRoleGroup(roleGroup);
        return "OK";

    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public @ResponseBody
    String delete(@RequestParam(value = "roleGroupId") int roleGroupId) {

        roleGroupService.deleteRoleGroup(roleGroupId);
        return "OK";
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public List<RoleGroup> listAll() {

        return roleGroupService.listAllRoleGroup();

    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    @ResponseBody
    public List<RoleGroup> findById(@RequestParam(value = "roleGroupId") int roleGroupId) {
        return roleGroupService.findById(roleGroupId);

    }

}
