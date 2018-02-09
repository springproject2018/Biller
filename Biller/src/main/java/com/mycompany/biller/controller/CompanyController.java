/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.controller;

import com.mycompany.biller.dto.Company;
import com.mycompany.biller.dto.Party;
import com.mycompany.biller.resources.CompanyResources;
import com.mycompany.biller.service.CompanyService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ismail
 */
@RestController
@RequestMapping(value = "/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @CrossOrigin
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    String add(@RequestParam(value = "name") String name, @RequestParam(value = "companyCode") String companyCode) {

        Company company = new Company();
        company.setName(name);
        company.setCompanyCode(companyCode);
        companyService.addCompany(company);
        return "OK";
    }

    @CrossOrigin
    @RequestMapping(value = "/createCompany", method = RequestMethod.POST)
    public ResponseEntity<CompanyResources> createCompany(@RequestBody CompanyResources companyResources) {
        System.out.println("*** createCompany ***");

        Company company = companyService.createCompany(companyResources.toCompany());

        companyResources.setCompanyId(company.getCompanyId());
        companyResources.setCompanyCode(company.getCompanyCode());
        companyResources.setName(company.getName());

        return new ResponseEntity<CompanyResources>(companyResources, HttpStatus.CREATED);
    }

    @CrossOrigin
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public @ResponseBody
    String update(@RequestParam(value = "companyId") int companyId, @RequestParam(value = "companyCode") String companyCode, @RequestParam(value = "name") String name) {
        Company company = new Company();
        company.setCompanyId(companyId);
        company.setCompanyCode(companyCode);
        company.setName(name);
        companyService.updateCompany(company);
        return "OK";

    }

    @CrossOrigin
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public @ResponseBody
    String delete(@RequestParam(value = "companyId") int companyId) {

        companyService.deleteCompany(companyId);
        return "OK";
    }

    @CrossOrigin
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Company> listAll() {

        return companyService.listAllCompany();

    }

    @CrossOrigin
    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    @ResponseBody
    public List<Company> findById(@RequestParam(value = "CompanyId") int CompanyId) {
        return companyService.findById(CompanyId);

    }

}
