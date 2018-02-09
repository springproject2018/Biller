/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "MENU_ROLE")
public class MenuRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MENU_ROLE_ID")
    private int menuRoleId;

    @Column(name = "DESCRIPTIN")
    private String description;

    @ManyToOne
    private Menus menus;

    @ManyToOne
    private RoleGroup roleGroup;

    @Override
    public String toString() {
        return "MenuRole{" + "menuRoleId=" + menuRoleId + ", description=" + description + ", menus=" + menus + ", roleGroup=" + roleGroup + '}';
    }

    public int getMenuRoleId() {
        return menuRoleId;
    }

    public void setMenuRoleId(int menuRoleId) {
        this.menuRoleId = menuRoleId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Menus getMenus() {
        return menus;
    }

    public void setMenus(Menus menus) {
        this.menus = menus;
    }

    public RoleGroup getRoleGroup() {
        return roleGroup;
    }

    public void setRoleGroup(RoleGroup roleGroup) {
        this.roleGroup = roleGroup;
    }

}
