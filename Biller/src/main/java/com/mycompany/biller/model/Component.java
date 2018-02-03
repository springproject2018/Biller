/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
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
    @Column(name = "COMPONENT_ID")
    private String componentId;

    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

  

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }
    
    @Column(name = "DESCRIPTIN")
    private int description;

    @Override
    public String toString() {
        return "Component{" + "componentId=" + componentId + ", description=" + description + '}';
    }
    
    
    
}
