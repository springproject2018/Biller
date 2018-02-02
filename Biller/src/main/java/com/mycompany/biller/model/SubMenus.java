/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author ismail
 */

@Entity
@Table(name = "SUB_MENUS")
public class SubMenus {
    
    @Id
    @Column(name = "SUB_MENUS_ID")
    private String menuId;

    @Column(name = "DESCRIPTION")
    private int description;
    
    @OneToOne
    private Menus menus;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public Menus getMenus() {
        return menus;
    }

    public void setMenus(Menus menus) {
        this.menus = menus;
    }

    @Override
    public String toString() {
        return "SubMenus{" + "menuId=" + menuId + ", description=" + description + ", menus=" + menus + '}';
    }
    
    
    
}
