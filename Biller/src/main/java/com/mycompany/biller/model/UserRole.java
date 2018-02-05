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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "USER_ROLE")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ROLE_ID")
    private int userRoleId;

    @Column(name = "DESCRIPTIN")
    private String description;

    @ManyToOne
    private UserLogin userLogin;

    @ManyToOne
    private RoleGroup roleGroup;

    public int getUserRoleId() {
        return userRoleId;
    }

    @Override
    public String toString() {
        return "UserRole{" + "userRoleId=" + userRoleId + ", description=" + description + ", userLogin=" + userLogin + ", roleGroup=" + roleGroup + '}';
    }

    public void setUserRoleId(int userRoleId) {
        this.userRoleId = userRoleId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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



}
