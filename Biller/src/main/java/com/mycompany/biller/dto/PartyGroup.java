/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.dto;

import java.math.BigDecimal;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "PARTY_GROUP")
public class PartyGroup {
    @Id
    @Column(name = "PARTY_GROUP_ID")
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int partyGroupId;

    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn 
    private Party party;
    
    @Column(name = "PARTY_GROUP_CODE")
    private String partyGroupCode;

    @Column(name = "PARTY_GROUP_NAME")
    private String partyGroupName;

  

    public int getPartyGroupId() {
        return partyGroupId;
    }
    public void setPartyGroupId(int partyGroupId) {
        this.partyGroupId = partyGroupId;
    }
    public String getPartyGroupCode() {
        return partyGroupCode;
    }

    public void setPartyGroupCode(String partyGroupCode) {
        this.partyGroupCode = partyGroupCode;
    }

    public String getPartyGroupName() {
        return partyGroupName;
    }

    public void setPartyGroupName(String partyGroupName) {
        this.partyGroupName = partyGroupName;
    }

    @Column(name = "PARTY_TYPE")
    private String partyType;

    //الرقم الضريبي للشركة
    @Column(name = "PARTY_TAX_ID")
    private int partyTaxId;

//رقم السجل التجاري
    @Column(name = "COMMERICAL_REGISTRATIO_NUM")
    private String commericalRegistrationNum;

    //رأس المال
    @Column(name = "PARTY_CAPITAL")
    private BigDecimal partyCapital;

    @Column(name = "PARTY_ACTIVITY")
    private String partyActivity;

    @Column(name = "PARTY_SIZE")
    private int partySize;

    //معدل الفواتير الشهرية
    @Column(name = "MONTHLY_INVOICING_RATE")
    private float monthlyInvoicingRate;

    @Column(name = "TELEPHONE_NUMBER1")
    private String telephoneNumber1;

    @Column(name = "TELEPHONE_NUMBER2")
    private String telephoneNumber2;

    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;

    @Column(name = "POSTAL_CODE")
    private String postalCode;

    @Column(name = "MAIL_BOX")
    private String mailBox;

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public String getPartyType() {
        return partyType;
    }

    public void setPartyType(String partyType) {
        this.partyType = partyType;
    }

    public int getPartyTaxId() {
        return partyTaxId;
    }

    public void setPartyTaxId(int partyTaxId) {
        this.partyTaxId = partyTaxId;
    }

    public String getCommericalRegistrationNum() {
        return commericalRegistrationNum;
    }

    public void setCommericalRegistrationNum(String commericalRegistrationNum) {
        this.commericalRegistrationNum = commericalRegistrationNum;
    }

    public BigDecimal getPartyCapital() {
        return partyCapital;
    }

    public void setPartyCapital(BigDecimal partyCapital) {
        this.partyCapital = partyCapital;
    }

    public String getPartyActivity() {
        return partyActivity;
    }

    public void setPartyActivity(String partyActivity) {
        this.partyActivity = partyActivity;
    }

    public int getPartySize() {
        return partySize;
    }

    public void setPartySize(int partySize) {
        this.partySize = partySize;
    }

    public float getMonthlyInvoicingRate() {
        return monthlyInvoicingRate;
    }

    public void setMonthlyInvoicingRate(float monthlyInvoicingRate) {
        this.monthlyInvoicingRate = monthlyInvoicingRate;
    }

    public String getTelephoneNumber1() {
        return telephoneNumber1;
    }

    public void setTelephoneNumber1(String telephoneNumber1) {
        this.telephoneNumber1 = telephoneNumber1;
    }

    public String getTelephoneNumber2() {
        return telephoneNumber2;
    }

    public void setTelephoneNumber2(String telephoneNumber2) {
        this.telephoneNumber2 = telephoneNumber2;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getMailBox() {
        return mailBox;
    }

    public void setMailBox(String mailBox) {
        this.mailBox = mailBox;
    }

}
