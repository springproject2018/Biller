/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.DAOImpl;

import com.mycompany.biller.DAO.*;
import com.mycompany.biller.model.MenuRole;
import com.mycompany.biller.model.Menus;
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
public class MenusDAOImpl implements MenusDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addMenus(Menus menus) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(menus);
    }

    @Override
    public void updateMenus(Menus menus) {
        Session session = sessionFactory.getCurrentSession();
        session.update(menus);
    }

    @Override
    public void deleteMenus(int id) {
        Session session = sessionFactory.getCurrentSession();
        Menus menus = (Menus) session.load(Menus.class, new Integer(id));
        if (menus != null) {
            session.delete(menus);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Menus> listAllMenus() {
        Session session = sessionFactory.getCurrentSession();
        List<Menus> menusList = session.createQuery("from Menus").list();
        return menusList;
    }

    @Override
    public List<Menus> findById(int id) {
        String selectQuery = "FROM Menus WHERE MENU_ID = :id";
        return sessionFactory
                .getCurrentSession()
                .createQuery(selectQuery)
                .setParameter("id", id)
                .list();
    }

}
