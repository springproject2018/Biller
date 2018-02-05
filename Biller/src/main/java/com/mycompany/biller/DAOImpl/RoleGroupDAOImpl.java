/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.DAOImpl;

import com.mycompany.biller.DAO.*;
import com.mycompany.biller.model.Person;
import com.mycompany.biller.model.RoleGroup;
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
public class RoleGroupDAOImpl implements RoleGroupDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addRoleGroup(RoleGroup roleGroup) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(roleGroup);
    }

    @Override
    public void updateRoleGroup(RoleGroup roleGroup) {
        Session session = sessionFactory.getCurrentSession();
        session.update(roleGroup);
    }

    @Override
    public void deleteRoleGroup(int id) {
        Session session = sessionFactory.getCurrentSession();
        RoleGroup roleGroup = (RoleGroup) session.load(RoleGroup.class, new Integer(id));
        if (roleGroup != null) {
            session.delete(roleGroup);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<RoleGroup> listAllRoleGroup() {
        Session session = sessionFactory.getCurrentSession();
        List<RoleGroup> roleGroupList = session.createQuery("from RoleGroup").list();
        return roleGroupList;
    }

    @Override
    public List<RoleGroup> findById(int id) {
        String selectQuery = "FROM RoleGroup WHERE ROLE_GROUP_ID = :id";
        return sessionFactory
                .getCurrentSession()
                .createQuery(selectQuery)
                .setParameter("id", id)
                .list();
    }

}
