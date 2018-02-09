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
import com.mycompany.biller.service.MenuRoleService;
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
@RequestMapping(value = "/menuRole")
public class MenuRoleController {

    @Autowired
    private MenuRoleService menuRoleService;

    @CrossOrigin
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    String add(@RequestParam(value = "description") String description,
            @RequestParam(value = "menusId") int menusId,
            @RequestParam(value = "roleGroupId") int roleGroupId) {

        Menus menus = new Menus();//menusId
        menus.setId(menusId);

        RoleGroup roleGroup = new RoleGroup();//roleGroupId
        roleGroup.setRoleGroupId(menusId);
        

        MenuRole menuRole = new MenuRole();
        menuRole.setDescription(description);
        menuRole.setMenus(menus);
        menuRole.setRoleGroup(roleGroup);
        menuRoleService.addMenuRole(menuRole);
        return "OK";
    }

    @CrossOrigin
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public @ResponseBody
    String update(@RequestParam(value = "menuRoleId") int menuRoleId,
            @RequestParam(value = "description") String description,
            @RequestParam(value = "menusId") int menusId,
            @RequestParam(value = "roleGroupId") int roleGroupId) {
        
        Menus menus = new Menus();//menusId
        menus.setId(menusId);

        RoleGroup roleGroup = new RoleGroup();//roleGroupId
        roleGroup.setRoleGroupId(menusId);
        

        MenuRole menuRole = new MenuRole();
        menuRole.setMenuRoleId(menuRoleId);
        menuRole.setDescription(description);
        menuRole.setMenus(menus);
        menuRole.setRoleGroup(roleGroup);
        menuRoleService.updateMenuRole(menuRole);
        return "OK";

    }

    @CrossOrigin
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public @ResponseBody
    String delete(@RequestParam(value = "menuRoleId") int menuRoleId) {

        menuRoleService.deleteMenuRole(menuRoleId);
        return "OK";
    }

    @CrossOrigin
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public List<MenuRole> listAll() {

        return menuRoleService.listAllCompany();

    }

    @CrossOrigin
    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    @ResponseBody
    public List<MenuRole> findById(@RequestParam(value = "menuRoleId") int menuRoleId) {
        return menuRoleService.findById(menuRoleId);

    }

}
