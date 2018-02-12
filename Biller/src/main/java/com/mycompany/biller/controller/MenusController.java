/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.controller;

import com.mycompany.biller.dto.Component;
import com.mycompany.biller.dto.MenuRole;
import com.mycompany.biller.dto.Menus;
import com.mycompany.biller.dto.RoleGroup;
import com.mycompany.biller.service.MenusService;
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
@RequestMapping(value = "/menus")
public class MenusController {

    @Autowired
    private MenusService menusService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    String add(@RequestParam(value = "description") String description,
            @RequestParam(value = "componentId") int componentId) {

        Component component = new Component();
        component.setComponentId(componentId);

        Menus menus = new Menus();//menusId
        menus.setDescription(description);
        menus.setComponent(component);
        menusService.addMenus(menus);
        return "OK";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public @ResponseBody
    String update(@RequestParam(value = "menusId") int menusId,
            @RequestParam(value = "description") String description,
            @RequestParam(value = "componentId") int componentId) {

        Component component = new Component();
        component.setComponentId(componentId);

        Menus menus = new Menus();//menusId
        menus.setId(menusId);
        menus.setDescription(description);
        menus.setComponent(component);
        menusService.updateMenus(menus);
        return "OK";

    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public @ResponseBody
    String delete(@RequestParam(value = "menusId") int menusId) {

        menusService.deleteMenus(menusId);
        return "OK";
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Menus> listAll() {

        return menusService.listAllMenus();

    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    @ResponseBody
    public List<Menus> findById(@RequestParam(value = "menusId") int menusId) {
        return menusService.findById(menusId);

    }

}
