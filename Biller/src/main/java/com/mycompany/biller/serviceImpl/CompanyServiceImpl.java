/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.serviceImpl;

import com.mycompany.biller.DAO.CompanyDAO;
import com.mycompany.biller.model.Company;
import com.mycompany.biller.service.CompanyService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ismail
 */
@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyDAO companyDAO;

    public void setCompanyDAO(CompanyDAO companyDAO) {
        this.companyDAO = companyDAO;
    }

    @Override
    public void addCompany(Company company) {
        companyDAO.addCompany(company);
    }

    @Override
    public void updateCompany(Company company) {
        companyDAO.updateCompany(company);
    }

    @Override
    public void deleteCompany(int companyId) {
        companyDAO.deleteCompany(companyId);
    }

    @Override
    public List<Company> listAllCompany() {
        return companyDAO.listAllCompany();
    }

    @Override
    public List<Company> findById(int companyId) {
        return companyDAO.findById(companyId);
    }

    @Override
    public Company createCompany(Company company) {
        return companyDAO.createCompany(company);
    }

}
