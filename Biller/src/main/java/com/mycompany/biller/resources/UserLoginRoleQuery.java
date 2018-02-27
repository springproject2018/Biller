/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.resources;

import com.mycompany.biller.dto.PartyGroup;
import java.math.BigDecimal;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.springframework.hateoas.ResourceSupport;

/**
 *
 * @author DELL
 */
public class UserLoginRoleQuery extends ResourceSupport {

    private BigDecimal userLoginId;
    private String userName;
    private String description;
    private String descriptionCom;
    private String enabled ="Valid";

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public BigDecimal getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(BigDecimal userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getDescriptionCom() {
        return descriptionCom;
    }

    public void setDescriptionCom(String descriptionCom) {
        this.descriptionCom = descriptionCom;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
