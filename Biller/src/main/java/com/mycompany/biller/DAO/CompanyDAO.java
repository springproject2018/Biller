/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.DAO;

import com.mycompany.biller.model.Company;
import com.mycompany.biller.model.Component;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface CompanyDAO {

    public void addCompany(Company company);

    public void updateCompany(Company company);

    public void deleteCompany(String companyId);

    public List<Company> listAllCompany();

    public List<Company> findById(String companyId);

}