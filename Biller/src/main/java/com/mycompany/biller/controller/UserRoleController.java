/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.controller;

import com.mycompany.biller.dto.Party;
import com.mycompany.biller.dto.RoleGroup;
import com.mycompany.biller.dto.UserLogin;
import com.mycompany.biller.dto.UserRole;
import com.mycompany.biller.service.UserRoleService;
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
 * @author Admin
 */
@RestController
@RequestMapping(value = "/userRole")
public class UserRoleController {

    @Autowired
    private UserRoleService userRoleService;

    @CrossOrigin
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    String add(@RequestParam(value = "description") String description,
            @RequestParam(value = "userLoginId") int userLoginId,
            @RequestParam(value = "roleGroupId") int roleGroupId) {

        UserLogin userLogin = new UserLogin();
        userLogin.setUserLoginId(userLoginId);

        RoleGroup roleGroup = new RoleGroup();
        roleGroup.setRoleGroupId(roleGroupId);

        UserRole userRole = new UserRole();
        userRole.setDescription(description);
        userRole.setUserLogin(userLogin);
        userRole.setRoleGroup(roleGroup);

        userRoleService.addUserRole(userRole);
        return "OK";
    }

    @CrossOrigin
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public @ResponseBody
    String update(@RequestParam(value = "userRoleId") int userRoleId,
            @RequestParam(value = "description") String description,
            @RequestParam(value = "userLoginId") int userLoginId,
            @RequestParam(value = "roleGroupId") int roleGroupId) {

        UserLogin userLogin = new UserLogin();
        userLogin.setUserLoginId(userLoginId);

        RoleGroup roleGroup = new RoleGroup();
        roleGroup.setRoleGroupId(roleGroupId);

        UserRole userRole = new UserRole();
        userRole.setUserRoleId(userRoleId);
        userRole.setDescription(description);
        userRole.setUserLogin(userLogin);
        userRole.setRoleGroup(roleGroup);

        userRoleService.updateUserRole(userRole);
        return "OK";
    }

    @CrossOrigin
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public @ResponseBody
    String delete(@RequestParam(value = "userRoleId") int userRoleId) {
        System.out.println("deleted");

        userRoleService.deleteUserRole(userRoleId);
        return "OK";
    }

    @CrossOrigin
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public List<UserRole> listAll() {

        return userRoleService.listAllUserRole();

    }

    @CrossOrigin
    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    @ResponseBody
    public List<UserRole> findById(@RequestParam(value = "userRoleId") int userRoleId) {
        return userRoleService.findById(userRoleId);

    }
}
