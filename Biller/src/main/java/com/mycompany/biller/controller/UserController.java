/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.controller;

import com.mycompany.biller.model.Party;
import com.mycompany.biller.model.UserLogin;
import com.mycompany.biller.service.UsersService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UsersService userService;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public @ResponseBody
    String add(@RequestParam(value = "userName") String name, @RequestParam(value = "password") String password, @RequestParam(value = "active") boolean active, @RequestParam(value = "party") String partyID) {
        System.out.println("adeed");

        Party party = new Party();
        party.setPartyId(partyID);

        UserLogin user = new UserLogin();
        user.setUserName(name);
        user.setPassword(password);
        user.setActive(active);
        user.setParty(party);
        userService.addUsers(user);
        return "OK";
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public @ResponseBody
    String update(@RequestParam(value = "userId") int userId, @RequestParam(value = "userName") String name, @RequestParam(value = "password") String password, @RequestParam(value = "active") boolean active, @RequestParam(value = "party") String partyID) {
        System.out.println("updated");
        Party party = new Party();
        party.setPartyId(partyID);

        UserLogin user = new UserLogin();
        user.setUserName(name);
        user.setPassword(password);
        user.setActive(active);
        user.setParty(party);
        userService.updateUsers(user);

        return "OK";
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
    public @ResponseBody
    String delete(@RequestParam(value = "userId") int userId) {
        System.out.println("deleted");

        userService.deleteUsers(userId);
        return "OK";
    }

    @RequestMapping(value = "/findAllUsers", method = RequestMethod.GET)
    @ResponseBody
    public List<UserLogin> listAll() {

        return userService.listAllUsers();

    }

    @RequestMapping(value = "/findUserById", method = RequestMethod.GET)
    @ResponseBody
    public List<UserLogin> findById(@RequestParam(value = "userId") int userId) {
        return userService.findById(userId);

    }
}
