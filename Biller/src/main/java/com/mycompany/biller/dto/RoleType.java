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
@Table(name = "ROLE_TYPE")
public class RoleType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ROLE_TYPE_ID")
    private int roleTypeID;

    @Column(name = "PARENT_ROLE_TYPE_ID")
    private String parentRoleTypeID;

    @Column(name = "DESCRIPTIN")
    private String description;

    public int getRoleTypeID() {
        return roleTypeID;
    }

    public void setRoleTypeID(int roleTypeID) {
        this.roleTypeID = roleTypeID;
    }

 
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getParentRoleTypeID() {
        return parentRoleTypeID;
    }

    public void setParentRoleTypeID(String parentRoleTypeID) {
        this.parentRoleTypeID = parentRoleTypeID;
    }

    @Override
    public String toString() {
        return "RoleType{" + "roleTypeID=" + roleTypeID + ", parentRoleTypeID=" + parentRoleTypeID + ", description=" + description + '}';
    }


   
}
