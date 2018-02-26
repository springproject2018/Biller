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
import javax.persistence.Table;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "GLOBAL_TYPE")
public class GlobalType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "GLOBAL_TYPE_ID")
    private int globalTypeId;

    @Column(name = "PARENT_GLOBAL_TYPE_ID")
    private int parentGlobalTypeId;
    
    @Column(name = "DESCRIPTIN")
    private String description;

    @Override
    public String toString() {
        return "GlobalType{" + "globalTypeId=" + globalTypeId + ", parentGlobalTypeId=" + parentGlobalTypeId + ", description=" + description + '}';
    }

    public int getGlobalTypeId() {
        return globalTypeId;
    }

    public void setGlobalTypeId(int globalTypeId) {
        this.globalTypeId = globalTypeId;
    }

    public int getParentGlobalTypeId() {
        return parentGlobalTypeId;
    }

    public void setParentGlobalTypeId(int parentGlobalTypeId) {
        this.parentGlobalTypeId = parentGlobalTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
