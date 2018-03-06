/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.controller;

import com.mycompany.biller.dto.Person;
import com.mycompany.biller.dto.UserLogin;
import com.mycompany.biller.dto.UserPreference;
import com.mycompany.biller.service.UserPreferenceService;
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
 * @author ismail
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/userPref")
public class UserPrefController {

    @Autowired
    private UserPreferenceService userPreferenceService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    ResponseEntity<UserPreference> add(
            @RequestParam(value = "userName") String userName,
            @RequestParam(value = "key") String key,
            @RequestParam(value = "value") String value
    ) {

        UserLogin userLogin = new UserLogin();
        userLogin.setUserName(userName);

        UserPreference userPreference = new UserPreference();
        userPreference.setKey(key);
        userPreference.setValue(value);
        userPreference.setUserLogin(userLogin);
        userPreferenceService.add(userPreference);
        return new ResponseEntity<UserPreference>(userPreference, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public @ResponseBody
    ResponseEntity<UserPreference> update(
            @RequestParam(value = "userName") String userName,
            @RequestParam(value = "key") String key,
            @RequestParam(value = "value") String value
    ) {

        UserLogin userLogin = new UserLogin();
        userLogin.setUserName(userName);

        UserPreference userPreference = new UserPreference();
        userPreference.setKey(key);
        userPreference.setValue(value);
        userPreference.setUserLogin(userLogin);
        userPreferenceService.update(userPreference);
        return new ResponseEntity<UserPreference>(userPreference, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public @ResponseBody
    String delete(@RequestParam(value = "Id") int Id) {

        userPreferenceService.delete(Id);
        return "OK";
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public List<UserPreference> listAll(
            @RequestParam(value = "userName") String userName
    ) {

        return userPreferenceService.listAll(userName);

    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    @ResponseBody
    public List<UserPreference> findById(
            @RequestParam(value = "userName") String userName,
            @RequestParam(value = "key") String key) {
        return userPreferenceService.findById(userName, key);

    }

}
