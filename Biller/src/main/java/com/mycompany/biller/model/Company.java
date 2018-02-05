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
 * @author Admin
 */
@Entity
@Table(name = "COMPANY")
public class Company {

    @Id
    @Column(name = "COMPANY_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int companyId;

    @Column(name = "NAME")
    private String name;

    @OneToOne
    private Party Party;

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public Party getParty() {
        return Party;
    }

    public void setParty(Party Party) {
        this.Party = Party;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Company{" + "companyId=" + companyId + ", name=" + name + ", Party=" + Party + '}';
    }



}
