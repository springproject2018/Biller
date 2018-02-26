/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.daoImpl;

import com.mycompany.biller.dao.GlobalItemDAO;
import com.mycompany.biller.dao.GlobalTypeDAO;
import com.mycompany.biller.dto.GlobalItem;
import com.mycompany.biller.dto.GlobalType;
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
public class GlobalItemDAOImpl implements GlobalItemDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addGlobalItem(GlobalItem globalItem) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(globalItem);
    }

    @Override
    public void updateGlobalItem(GlobalItem globalItem) {
        Session session = sessionFactory.getCurrentSession();
        session.update(globalItem);
    }

    @Override
    public void deleteGlobalItem(int globalItemId) {
        Session session = sessionFactory.getCurrentSession();
        GlobalItem globalItem = (GlobalItem) session.load(GlobalItem.class, new Integer(globalItemId));
        if (globalItem != null) {
            session.delete(globalItem);
        }
    }

    @Override
    public List<GlobalItem> listAllGlobalItem() {
        Session session = sessionFactory.getCurrentSession();
        List<GlobalItem> globalItems = session.createQuery("from GlobalItem").list();
        return globalItems;
    }

    @Override
    public List<GlobalItem> findGlobalItemById(int globalItemId) {
        String selectQuery = "FROM GlobalItem WHERE GLOBAL_ITEM_ID = :globalItemId";
        return sessionFactory
                .getCurrentSession()
                .createQuery(selectQuery)
                .setParameter("globalItemId", globalItemId)
                .list();
    }
}
