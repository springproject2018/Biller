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
@Table(name = "MENUS")
public class Menus {

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

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }
    
    

    @Id
    @Column(name = "MENUS_ID")
    private String menuId;

    @Column(name = "DESCRIPTION")
    private int description;
    
    @OneToOne
    private Component component;

    @Override
    public String toString() {
        return "Menus{" + "menuId=" + menuId + ", description=" + description + '}';
    }
    
    

}
