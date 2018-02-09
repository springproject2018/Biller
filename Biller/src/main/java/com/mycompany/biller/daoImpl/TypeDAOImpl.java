/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.daoImpl;

import com.mycompany.biller.dao.TypeDAO;
import com.mycompany.biller.dto.RoleGroup;
import com.mycompany.biller.dto.Type;
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
public class TypeDAOImpl implements TypeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addType(Type type) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(type);
    }

    @Override
    public void updateType(Type type) {
        Session session = sessionFactory.getCurrentSession();
        session.update(type);
    }

    @Override
    public void deleteType(int id) {
        Session session = sessionFactory.getCurrentSession();
        Type type = (Type) session.load(Type.class, new Integer(id));
        if (type != null) {
            session.delete(type);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Type> listAllType() {
        Session session = sessionFactory.getCurrentSession();
        List<Type> TypeList = session.createQuery("from Type").list();
        return TypeList;
    }

    @Override
    public List<Type> findById(int id) {
        String selectQuery = "FROM Type WHERE TYPE_ID = :id";
        return sessionFactory
                .getCurrentSession()
                .createQuery(selectQuery)
                .setParameter("id", id)
                .list();
    }

}
