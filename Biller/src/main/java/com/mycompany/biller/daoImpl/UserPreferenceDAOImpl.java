/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.daoImpl;

import com.mycompany.biller.dao.UserPreferenceDAO;
import com.mycompany.biller.dto.UserLogin;
import com.mycompany.biller.dto.UserPreference;
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
public class UserPreferenceDAOImpl implements UserPreferenceDAO {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void add(UserPreference userPreference) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(userPreference);
    }
    
    @Override
    public void update(UserPreference userPreference) {
        Session session = sessionFactory.getCurrentSession();
        session.update(userPreference);
    }
    
    @Override
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        UserPreference userPreference = (UserPreference) session.load(UserPreference.class, new Integer(id));
        if (userPreference != null) {
            session.delete(userPreference);
        }
    }
    
    @Override
    public List<UserPreference> listAll(String userName) {
        Session session = sessionFactory.getCurrentSession();
        List<UserPreference> userPreferenceList = session.createQuery("from UserPreference where USER_NAME=:userName")
                .setParameter("userName", userName)
                .list();
        return userPreferenceList;
    }
    
    @Override
    public List<UserPreference> findById(String userName, String key) {
        
        Session session = sessionFactory.getCurrentSession();
        List<UserPreference> userPreferenceList = session.createQuery("from UserPreference where USER_NAME=:userName AND KEY:key")
                .setParameter("userName", userName)
                .setParameter("key", key)
                .list();
        return userPreferenceList;
        
    }
    
}
