/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.resources;

import com.mycompany.biller.dto.Party;
import com.mycompany.biller.dto.PartyGroup;
import java.math.BigDecimal;
import org.springframework.hateoas.ResourceSupport;

/**
 *
 * @author DELL
 */
public class PartyGroupResources extends ResourceSupport {

    private Party party;

    private int partyGroupId;
    private String partyGroupCode;
    private String partyGroupName;
    private int partyId;

    private String partyType;
    private String companyType;
    private int partyTaxId;
    private String commericalRegistrationNum;
    private BigDecimal partyCapital;
    private String partyActivity;
    private int partySize;
    private float monthlyInvoicingRate;
    private String telephoneNumber1;
    private String telephoneNumber2;
    private String mobileNumber;
    private String postalCode;
    private String mailBox;

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public int getPartyId() {
        return partyId;
    }

    public void setPartyId(int partyId) {
        this.partyId = partyId;
    }

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

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public void setPartyGroupName(String partyGroupName) {
        this.partyGroupName = partyGroupName;
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

    public PartyGroup toPartyGroup() {
        Party party = new Party();
        party.setPartyId(partyId);

        PartyGroup partyGroup = new PartyGroup();
        partyGroup.setPartyGroupId(partyGroupId);
        partyGroup.setPartyGroupCode(partyGroupCode);
        partyGroup.setPartyGroupName(partyGroupName);
        partyGroup.setParty(party);
        partyGroup.setCompanyType(companyType);
        partyGroup.setPartyTaxId(partyTaxId);
        partyGroup.setPartyType(partyType);
        partyGroup.setCommericalRegistrationNum(commericalRegistrationNum);
        partyGroup.setPartyActivity(partyActivity);
        partyGroup.setPartyCapital(partyCapital);
        partyGroup.setPartySize(partySize);
        partyGroup.setMailBox(mailBox);
        partyGroup.setMobileNumber(mobileNumber);
        partyGroup.setMonthlyInvoicingRate(monthlyInvoicingRate);
        partyGroup.setPostalCode(postalCode);
        partyGroup.setTelephoneNumber1(telephoneNumber1);
        partyGroup.setTelephoneNumber2(telephoneNumber2);
        return partyGroup;
    }
}
