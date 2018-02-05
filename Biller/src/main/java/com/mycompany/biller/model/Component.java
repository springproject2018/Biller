/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ismail
 */
@Entity
@Table(name = "COMPONENT")
public class Component {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COMPONENT_ID")
    private int componentId;

    @Column(name = "DESCRIPTIN")
    private String description;

    @Override
    public String toString() {
        return "Component{" + "componentId=" + componentId + ", description=" + description + '}';
    }

    public int getComponentId() {
        return componentId;
    }

    public void setComponentId(int componentId) {
        this.componentId = componentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
