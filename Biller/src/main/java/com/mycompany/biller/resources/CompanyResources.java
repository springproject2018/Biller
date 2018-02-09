/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.resources;

import com.mycompany.biller.dto.Company;
import org.springframework.hateoas.ResourceSupport;

/**
 *
 * @author DELL
 */
public class CompanyResources extends ResourceSupport {

    private int companyId;
    private String companyCode;
    private String name;

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company toCompany() {

        Company company = new Company();
        company.setCompanyId(companyId);
        company.setCompanyCode(companyCode);
        company.setName(name);
        return company;
    }
}
