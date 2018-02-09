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
@Table(name = "MENUS")
public class Menus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MENUS_ID")
    private int menusId;

    @Column(name = "DESCRIPTIN")
    private String description;
    
    @ManyToOne
    private Component component;

    @Override
    public String toString() {
        return "Menus{" + "menusId=" + menusId + ", description=" + description + ", component=" + component + '}';
    }

    public int getId() {
        return menusId;
    }

    public void setId(int menusId) {
        this.menusId = menusId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

}
