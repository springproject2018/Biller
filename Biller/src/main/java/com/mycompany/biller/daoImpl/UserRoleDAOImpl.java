/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.daoImpl;

import com.mycompany.biller.dao.UserRoleDAO;
import com.mycompany.biller.dto.UserRole;
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
public class UserRoleDAOImpl implements UserRoleDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addUserRole(UserRole userRole) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(userRole);
    }

    @Override
    public void updateUserRole(UserRole userRole) {
        Session session = sessionFactory.getCurrentSession();
        session.update(userRole);
    }

    @Override
    public void deleteUserRole(int id) {
        Session session = sessionFactory.getCurrentSession();
        UserRole userRole = (UserRole) session.load(UserRole.class, new Integer(id));
        if (userRole != null) {
            session.delete(userRole);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<UserRole> listAllUserRole() {
        Session session = sessionFactory.getCurrentSession();
        List<UserRole> userRoleList = session.createQuery("from UserRole").list();
        return userRoleList;
    }

    @Override
    public List<UserRole> findById(int id) {
        String selectQuery = "FROM UserRole WHERE USER_ROLE_ID = :id";
        return sessionFactory
                .getCurrentSession()
                .createQuery(selectQuery)
                .setParameter("id", id)
                .list();
    }

}
