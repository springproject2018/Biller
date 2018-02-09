/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.daoImpl;

import com.mycompany.biller.dao.MenuRoleDAO;
import com.mycompany.biller.dto.Company;
import com.mycompany.biller.dto.MenuRole;
import com.mycompany.biller.dto.Party;
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
public class MenuRoleDAOImpl implements MenuRoleDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addMenuRole(MenuRole menuRole) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(menuRole);
    }

    @Override
    public void updateMenuRole(MenuRole menuRole) {
        Session session = sessionFactory.getCurrentSession();
        session.update(menuRole);
    }

    @Override
    public void deleteMenuRole(int menuRoleId) {
        Session session = sessionFactory.getCurrentSession();
        MenuRole menuRole = (MenuRole) session.load(MenuRole.class, new Integer(menuRoleId));
        if (menuRole != null) {
            session.delete(menuRole);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<MenuRole> listAllMenuRole() {
        Session session = sessionFactory.getCurrentSession();
        List<MenuRole> menuRoleList = session.createQuery("from MenuRole").list();
        return menuRoleList;
    }

    @Override
    public List<MenuRole> findById(int menuRole) {
        String selectQuery = "FROM MenuRole WHERE MENU_ROLE_ID = :menuRole";
        return sessionFactory
                .getCurrentSession()
                .createQuery(selectQuery)
                .setParameter("menuRole", menuRole)
                .list();
    }

}
