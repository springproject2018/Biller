/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.controller;

import com.mycompany.biller.model.Users;
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
public class UserController {

    @Autowired
    private UsersService userService;

    public UsersService getUserService() {
        return userService;
    }

    public void setUserService(UsersService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    String add(@RequestParam(value = "name") String name, @RequestParam(value = "age") String age) {
        System.out.println("adeed");
        Users user = new Users();
        user.setAge(age);
        user.setName(name);
        userService.addUsers(user);
        return "OK";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public @ResponseBody
    String update(@RequestParam(value = "userId") int userId, @RequestParam(value = "name") String name, @RequestParam(value = "age") String age) {
        System.out.println("updated");
        Users user = new Users();
        user.setUserId(userId);
        user.setAge(age);
        user.setName(name);
        userService.updateUsers(user);

        return "OK";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public @ResponseBody
    String delete(@RequestParam(value = "userId") int userId) {
        System.out.println("deleted");

        userService.deleteUsers(userId);
        return "OK";
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Users> listAll() {
        
        return userService.listAllUsers();

    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    @ResponseBody
    public List<Users> findById(@RequestParam(value = "userId") int userId) {
        return userService.findById(userId);

    }
}
