/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.daoImpl;

import com.mycompany.biller.dao.UploadBillsDAO;
import com.mycompany.biller.dto.UploadBills;
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
public class UploadBillsDAOImpl implements UploadBillsDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void addUploadBills(UploadBills uploadBills) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(uploadBills);
    }

    @Override
    public void updateUploadBills(UploadBills uploadBills) {
        Session session = sessionFactory.getCurrentSession();
        session.update(uploadBills);
    }

    @Override
    public void deleteUploadBills(int id) {
        Session session = sessionFactory.getCurrentSession();
        UploadBills uploadBills = (UploadBills) session.load(UploadBills.class, new Integer(id));
        if (uploadBills != null) {
            session.delete(uploadBills);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<UploadBills> listAllUploadBills() {
        Session session = sessionFactory.getCurrentSession();
        List<UploadBills> uploadBillsList = session.createQuery("from UploadBills").list();
        return uploadBillsList;
    }

    @Override
    public List<UploadBills> findUploadBillsById(int id) {
        String selectQuery = "FROM UploadBills WHERE id = :id";
        return sessionFactory
                .getCurrentSession()
                .createQuery(selectQuery)
                .setParameter("id", id)
                .list();
    }

}
