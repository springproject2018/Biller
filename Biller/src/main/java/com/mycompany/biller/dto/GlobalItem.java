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
 * @author DELL
 */
@Entity
@Table(name = "GLOBAL_ITEM")
public class GlobalItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "GLOBAL_ITEM_ID")
    private int globalItemId;

    @Column(name = "GLOBAL_ITEM_CODE")
    private String globalItemCode;

    @Column(name = "DESCRIPTIN")
    private String description;

    @ManyToOne
    private GlobalType globalType;

    @Override
    public String toString() {
        return "GlobalItem{" + "globalItemId=" + globalItemId + ", globalItemCode=" + globalItemCode + ", description=" + description + ", globalType=" + globalType + '}';
    }

    public int getGlobalItemId() {
        return globalItemId;
    }

    public void setGlobalItemId(int globalItemId) {
        this.globalItemId = globalItemId;
    }

    public String getGlobalItemCode() {
        return globalItemCode;
    }

    public void setGlobalItemCode(String globalItemCode) {
        this.globalItemCode = globalItemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GlobalType getGlobalType() {
        return globalType;
    }

    public void setGlobalType(GlobalType globalType) {
        this.globalType = globalType;
    }

}
