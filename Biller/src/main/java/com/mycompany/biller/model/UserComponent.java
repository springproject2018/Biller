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
@Table(name = "USER_COMPONENT")
public class UserComponent {
    
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_COMPONENT_ID")
    private int userComponentId;
    
    @OneToOne
    private Users users;

    @OneToOne
    private Component component;

    @Override
    public String toString() {
        return "UserComponent{" + "userComponentId=" + userComponentId + ", users=" + users + ", component=" + component + '}';
    }

    public int getUserComponentId() {
        return userComponentId;
    }

    public void setUserComponentId(int userComponentId) {
        this.userComponentId = userComponentId;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }
    
}
