/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.DAOImpl;

import com.mycompany.biller.DAO.UserDAO;
import com.mycompany.biller.model.Users;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin
 */
@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addUsers(Users u) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(u);
    }

    @Override
    public void updateUsers(Users u) {
        Session session = sessionFactory.getCurrentSession();
        session.update(u);
    }

    @Override
    public void deleteUsers(int id) {
        Session session = sessionFactory.getCurrentSession();
        Users u = (Users) session.load(Users.class, new Integer(id));
        if (u != null) {
            session.delete(u);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Users> listAllUsers() {
        Session session = sessionFactory.getCurrentSession();
        List<Users> personList = session.createQuery("from Users").list();
        return   personList;
    }

    @Override
    public List<Users> findById(int id) {
        String selectQuery = "FROM Users WHERE user_id = :id";
        return sessionFactory
                .getCurrentSession()
                .createQuery(selectQuery)
                .setParameter("id", id)
                .list();
    }

}
