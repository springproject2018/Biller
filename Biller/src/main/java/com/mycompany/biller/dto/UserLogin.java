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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "USER_LOGIN")
public class UserLogin {

    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_LOGIN_ID")
    private int userLoginId;

    @Id
    @Column(name = "USER_NAME", unique = true)
    private String userName;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "PASSWORD_HINT")
    private String passwordHint;

    @Column(name = "ENABLED")
    private char enabled; // Y or N

//    @OneToOne
    @ManyToOne
    private Party party;

    public int getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(int userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordHint() {
        return passwordHint;
    }

    public void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint;
    }

    public char getEnabled() {
        return enabled;
    }

    public void setEnabled(char enabled) {
        this.enabled = enabled;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    @Override
    public String toString() {
        return "UserLogin{" + "userLoginId=" + userLoginId + ", userName=" + userName + ", password=" + password + ", passwordHint=" + passwordHint + ", enabled=" + enabled + ", party=" + party + '}';
    }

}
