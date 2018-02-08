/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.DAOImpl;

import com.mycompany.biller.DAO.*;
import com.mycompany.biller.model.Company;
import com.mycompany.biller.model.Party;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ismail
 */
@Repository
public class CompanyDAOImpl implements CompanyDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCompany(Company company) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(company);
    }

    @Override
    public void updateCompany(Company company) {
        Session session = sessionFactory.getCurrentSession();
        session.update(company);
    }

    @Override
    public void deleteCompany(int companyId) {
        Session session = sessionFactory.getCurrentSession();
        Company company = (Company) session.load(Company.class, new Integer(companyId));
        if (company != null) {
            session.delete(company);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Company> listAllCompany() {
        Session session = sessionFactory.getCurrentSession();
        List<Company> companyList = session.createQuery("from Company").list();
        return companyList;
    }

    @Override
    public List<Company> findById(int companyId) {
        String selectQuery = "FROM Company WHERE COMPANY_ID = :companyId";
        return sessionFactory
                .getCurrentSession()
                .createQuery(selectQuery)
                .setParameter("companyId", companyId)
                .list();
    }

    @Override
    public Company createCompany(Company company) {
        int id = (int) sessionFactory.getCurrentSession().save(company);

        company.setCompanyId(id);

        return company;
    }

}
