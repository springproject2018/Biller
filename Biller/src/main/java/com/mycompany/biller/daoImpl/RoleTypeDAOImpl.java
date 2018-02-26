/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.daoImpl;

import com.mycompany.biller.dto.RoleGroup;
import com.mycompany.biller.dto.RoleType;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mycompany.biller.dao.RoleTypeDAO;

/**
 *
 * @author ismail
 */

@Repository
public class RoleTypeDAOImpl implements RoleTypeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addRoleType(RoleType type) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(type);
    }

    @Override
    public void updateRoleType(RoleType type) {
        Session session = sessionFactory.getCurrentSession();
        session.update(type);
    }

    @Override
    public void deleteRoleType(int id) {
        Session session = sessionFactory.getCurrentSession();
        RoleType type = (RoleType) session.load(RoleType.class, new Integer(id));
        if (type != null) {
            session.delete(type);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<RoleType> listAllRoleType() {
        Session session = sessionFactory.getCurrentSession();
        List<RoleType> TypeList = session.createQuery("from RoleType").list();
        return TypeList;
    }

    @Override
    public List<RoleType> findRoleTypeById(int id) {
        String selectQuery = "FROM RoleType WHERE ROLE_TYPE_ID = :id";
        return sessionFactory
                .getCurrentSession()
                .createQuery(selectQuery)
                .setParameter("id", id)
                .list();
    }

}
