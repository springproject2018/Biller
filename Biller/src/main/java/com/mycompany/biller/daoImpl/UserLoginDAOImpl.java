/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.daoImpl;

import com.mycompany.biller.dto.UserLogin;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mycompany.biller.dao.UserLoginDAO;

/**
 *
 * @author Admin
 */
@Repository
public class UserLoginDAOImpl implements UserLoginDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addUserLogin(UserLogin userLogin) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(userLogin);
    }

    @Override
    public void updateUserLogin(UserLogin userLogin) {
        Session session = sessionFactory.getCurrentSession();
        session.update(userLogin);
    }

    @Override
    public void deleteUserLogin(int id) {
        Session session = sessionFactory.getCurrentSession();
        UserLogin userLogin = (UserLogin) session.load(UserLogin.class, new Integer(id));
        if (userLogin != null) {
            session.delete(userLogin);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<UserLogin> listAllUserLogin() {
        Session session = sessionFactory.getCurrentSession();
        List<UserLogin> userLoginList = session.createQuery("from UserLogin").list();
        return userLoginList;
    }

    @Override
    public List<UserLogin> findById(int id) {
        String selectQuery = "FROM UserLogin WHERE USER_LOGIN_ID = :id";
        return sessionFactory
                .getCurrentSession()
                .createQuery(selectQuery)
                .setParameter("id", id)
                .list();
    }

}
