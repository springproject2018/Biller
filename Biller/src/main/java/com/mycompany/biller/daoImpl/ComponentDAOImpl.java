/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.daoImpl;

import com.mycompany.biller.dao.ComponentDAO;
import com.mycompany.biller.dto.Company;
import com.mycompany.biller.dto.Component;
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
public class ComponentDAOImpl implements ComponentDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addComponent(Component component) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(component);
    }

    @Override
    public void updateComponent(Component component) {
        Session session = sessionFactory.getCurrentSession();
        session.update(component);
    }

    @Override
    public void deleteComponent(int componentId) {
        Session session = sessionFactory.getCurrentSession();
        Component component = (Component) session.load(Component.class, new Integer(componentId));
        if (component != null) {
            session.delete(component);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Component> listAllComponent() {
        Session session = sessionFactory.getCurrentSession();
        List<Component> componentList = session.createQuery("from Component").list();
        return componentList;
    }

    @Override
    public List<Component> findById(int componentId) {
        String selectQuery = "FROM Component WHERE COMPONENT_ID = :componentId";
        return sessionFactory
                .getCurrentSession()
                .createQuery(selectQuery)
                .setParameter("componentId", componentId)
                .list();
    }

}
