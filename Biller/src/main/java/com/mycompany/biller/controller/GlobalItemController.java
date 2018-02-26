/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.controller;

import com.mycompany.biller.dto.GlobalItem;
import com.mycompany.biller.dto.GlobalType;
import com.mycompany.biller.service.GlobalItemService;
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
@RequestMapping(value = "/globalItem")
public class GlobalItemController {

    @Autowired
    private GlobalItemService globalItemService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    String add(@RequestParam(value = "globalItemCode") String globalItemCode,
            @RequestParam(value = "description") String description,
            @RequestParam(value = "globalTypeId") int globalTypeId) {

        GlobalType globalType = new GlobalType();
        globalType.setGlobalTypeId(globalTypeId);

        GlobalItem globalItem = new GlobalItem();
        globalItem.setGlobalItemCode(globalItemCode);
        globalItem.setDescription(description);
        globalItem.setGlobalType(globalType);
        globalItemService.addGlobalItem(globalItem);
        return "OK";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public @ResponseBody
    String update(@RequestParam(value = "globalItemCode") String globalItemCode,
            @RequestParam(value = "description") String description,
            @RequestParam(value = "globalTypeId") int globalTypeId) {

        GlobalType globalType = new GlobalType();
        globalType.setGlobalTypeId(globalTypeId);

        GlobalItem globalItem = new GlobalItem();
        globalItem.setGlobalItemCode(globalItemCode);
        globalItem.setDescription(description);
        globalItem.setGlobalType(globalType);
        globalItemService.updateGlobalItem(globalItem);
        return "OK";

    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public @ResponseBody
    String delete(@RequestParam(value = "globalItemId") int globalItemId) {

        globalItemService.deleteGlobalItem(globalItemId);
        return "OK";
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public List<GlobalItem> listAll() {

        return globalItemService.listAllGlobalItem();

    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    @ResponseBody
    public List<GlobalItem> findById(@RequestParam(value = "globalItemId") int globalItemId) {
        return globalItemService.findGlobalItemById(globalItemId);

    }

}
