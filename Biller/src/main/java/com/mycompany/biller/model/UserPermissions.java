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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author ismail
 */
@Entity
@Table(name = "USER_PERMISSIONS")
public class UserPermissions {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_PERMISSIONS_ID")
    private int userPermissionId;
    
    @OneToOne
    private Users users;

    public int getUserPermissionId() {
        return userPermissionId;
    }

    @Override
    public String toString() {
        return "UserPermissions{" + "userPermissionId=" + userPermissionId + ", users=" + users + ", permissions=" + permissions + '}';
    }

    public void setUserPermissionId(int userPermissionId) {
        this.userPermissionId = userPermissionId;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Permissions getPermissions() {
        return permissions;
    }

    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }
    
    @OneToOne
    private Permissions permissions;
}
