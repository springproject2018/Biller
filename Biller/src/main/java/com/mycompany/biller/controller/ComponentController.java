/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.controller;

import com.mycompany.biller.dto.Company;
import com.mycompany.biller.dto.Component;
import com.mycompany.biller.service.ComponentService;
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
@RequestMapping(value = "/component")
public class ComponentController {

    @Autowired
    private ComponentService componentService;

    @CrossOrigin
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    String add(@RequestParam(value = "description") String description) {

        Component component = new Component();
        component.setDescription(description);
        componentService.addComponent(component);
        return "OK";
    }

    @CrossOrigin
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public @ResponseBody
    String update(@RequestParam(value = "componentId") int componentId, @RequestParam(value = "description") String description) {
        Component component = new Component();
        component.setComponentId(componentId);
        component.setDescription(description);
        componentService.updateComponent(component);
        return "OK";

    }

    @CrossOrigin
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public @ResponseBody
    String delete(@RequestParam(value = "componentId") int componentId) {

        componentService.deleteComponent(componentId);
        return "OK";
    }

    @CrossOrigin
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Component> listAll() {

        return componentService.listAllComponent();

    }

    @CrossOrigin
    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    @ResponseBody
    public List<Component> findById(@RequestParam(value = "componentId") int componentId) {
        return componentService.findById(componentId);

    }

}
