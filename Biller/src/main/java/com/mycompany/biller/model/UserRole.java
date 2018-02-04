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
 * @author Admin
 */
@Entity
@Table(name = "USER_ROLE")
public class UserRole {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private String ID;

    @Id
    private UserLogin userLogin;
    
    @Id
    private RoleGroup roleGroup;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public UserLogin getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }

    public RoleGroup getRoleGroup() {
        return roleGroup;
    }

    public void setRoleGroup(RoleGroup roleGroup) {
        this.roleGroup = roleGroup;
    }

    @Override
    public String toString() {
        return "UserRole{" + "ID=" + ID + ", userLogin=" + userLogin + ", roleGroup=" + roleGroup + '}';
    }
    
    
    

}
