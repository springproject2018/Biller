/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.controller;

import com.mycompany.biller.dto.Component;
import com.mycompany.biller.dto.GlobalType;
import com.mycompany.biller.service.GlobalTypeService;
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
@RequestMapping(value = "/globalType")
public class GlobalTypeController {

    @Autowired
    private GlobalTypeService globalTypeService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    String add(@RequestParam(value = "parentGlobalTypeId", required = false) int parentGlobalTypeId,
            @RequestParam(value = "description") String description) {
        GlobalType globalType = new GlobalType();
        globalType.setParentGlobalTypeId(parentGlobalTypeId);
        globalType.setDescription(description);
        globalTypeService.addGlobalType(globalType);
        return "OK";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public @ResponseBody
    String update(@RequestParam(value = "parentGlobalTypeId") int parentGlobalTypeId,
            @RequestParam(value = "description") String description) {
        GlobalType globalType = new GlobalType();
        globalType.setParentGlobalTypeId(parentGlobalTypeId);
        globalType.setDescription(description);
        globalTypeService.updateGlobalType(globalType);
        return "OK";

    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public @ResponseBody
    String delete(@RequestParam(value = "globalTypeId") int globalTypeId) {

        globalTypeService.deleteGlobalType(globalTypeId);
        return "OK";
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public List<GlobalType> listAll() {

        return globalTypeService.listAllGlobalType();

    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    @ResponseBody
    public List<GlobalType> findById(@RequestParam(value = "globalTypeId") int globalTypeId) {
        return globalTypeService.findGlobalTypeById(globalTypeId);

    }

}
