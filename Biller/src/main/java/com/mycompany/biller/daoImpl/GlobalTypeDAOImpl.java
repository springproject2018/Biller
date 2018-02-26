/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.daoImpl;

import com.mycompany.biller.dao.GlobalTypeDAO;
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
public class GlobalTypeDAOImpl implements GlobalTypeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addGlobalType(GlobalType globalType) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(globalType);

    }

    @Override
    public void updateGlobalType(GlobalType globalType) {
        Session session = sessionFactory.getCurrentSession();
        session.update(globalType);
    }

    @Override
    public void deleteGlobalType(int globalTypeId) {
        Session session = sessionFactory.getCurrentSession();
        GlobalType globalType = (GlobalType) session.load(GlobalType.class, new Integer(globalTypeId));
        if (globalType != null) {
            session.delete(globalType);
        }
    }

    @Override
    public List<GlobalType> listAllGlobalType() {
        Session session = sessionFactory.getCurrentSession();
        List<GlobalType> globalTypes = session.createQuery("from GlobalType").list();
        return globalTypes;
    }

    @Override
    public List<GlobalType> findGlobalTypeById(int globalTypeId) {
        String selectQuery = "FROM GlobalType WHERE GLOBAL_TYPE_ID = :globalTypeId";
        return sessionFactory
                .getCurrentSession()
                .createQuery(selectQuery)
                .setParameter("globalTypeId", globalTypeId)
                .list();
    }
}
