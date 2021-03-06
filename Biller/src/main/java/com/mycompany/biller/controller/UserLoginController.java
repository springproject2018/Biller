/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.controller;

import com.mycompany.biller.dto.Party;
import com.mycompany.biller.dto.UserLogin;
import com.mycompany.biller.resources.UserLoginRoleQuery;
import com.mycompany.biller.service.UserLoginService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@CrossOrigin
@RestController
@RequestMapping(value = "/userLogin")
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
    @ResponseBody
    List<UserLoginRoleQuery> checkLogin(@RequestParam(value = "userName") String userName,
            @RequestParam(value = "password") String password) {
        if (userLoginService.checkLogin(userName, password)) {
//            return userLoginService.usrerLoginRole(userName);
            return (List<UserLoginRoleQuery>) userLoginService.userLoginRoleQuery(userName);
        } else {
            UserLoginRoleQuery userLoginRoleQuery = new UserLoginRoleQuery();
            userLoginRoleQuery.setEnabled("Invalid");
            userLoginRoleQuery.setUserName(userName);
            List<UserLoginRoleQuery> list = new ArrayList<UserLoginRoleQuery>();
            list.add(userLoginRoleQuery);
            return list;
        }
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    String add(
            @RequestParam(value = "userName") String name,
            @RequestParam(value = "password") String password,
            @RequestParam(value = "enabled") char enabled,
            @RequestParam(value = "partyId") int partyID) {
        System.out.println("adeed");

        Party party = new Party();
        party.setPartyId(partyID);

        UserLogin user = new UserLogin();
        user.setUserName(name);
        user.setPassword(password);
        user.setEnabled(enabled);
        user.setParty(party);
        userLoginService.addUserLogin(user);
        return "OK";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public @ResponseBody
    String update(@RequestParam(value = "userLoginId") int userLoginId,
            @RequestParam(value = "userName") String name,
            @RequestParam(value = "password") String password,
            @RequestParam(value = "enabled") char enabled,
            @RequestParam(value = "party") int partyID) {
        System.out.println("updated");
        Party party = new Party();
        party.setPartyId(partyID);

        UserLogin user = new UserLogin();
        user.setUserName(name);
        user.setPassword(password);
        user.setEnabled(enabled);
        user.setParty(party);
        userLoginService.updateUserLogin(user);

        return "OK";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public @ResponseBody
    String delete(@RequestParam(value = "userLoginId") int userId) {
        System.out.println("deleted");

        userLoginService.deleteUserLogin(userId);
        return "OK";
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public List<UserLogin> listAll() {

        return userLoginService.listAllUserLogin();

    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    @ResponseBody
    public List<UserLogin> findById(@RequestParam(value = "userLoginId") int userId) {
        return userLoginService.findById(userId);

    }

    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public ResponseEntity<List<UserLoginRoleQuery>> query(@RequestParam(value = "userName") String userName) {
        System.out.println("*** UserLoginRoleQuery service ***");

        List<UserLoginRoleQuery> userLoginRoleQuery = userLoginService.userLoginRoleQuery(userName);

        return new ResponseEntity<List<UserLoginRoleQuery>>(userLoginRoleQuery, HttpStatus.OK);
    }
}
