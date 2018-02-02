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
@Table(name = "PERMISSIONS")
public class Permissions {
    
    @Id
    @Column(name = "PERMISSIONS_ID")
    private String permissionsId;
    
    @Column(name = "DESCRIPTION")
    private int description;

    public String getPermissionsId() {
        return permissionsId;
    }

    public void setPermissionsId(String permissionsId) {
        this.permissionsId = permissionsId;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Permissions{" + "permissionsId=" + permissionsId + ", description=" + description + '}';
    }
    
}
