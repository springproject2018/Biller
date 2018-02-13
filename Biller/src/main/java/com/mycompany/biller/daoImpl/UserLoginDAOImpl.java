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
import java.util.HashMap;
import java.util.Map;

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

    @Override
    public List<Object> usrerLoginRole(String userName) {
        String selectQuery = "select UL.userLoginId,UL.userName,UR.description AS DESC_USER_ROLE ,RG.description AS DESC_ROLE_GROUP,\n"
                + "MR.description AS DESC_MENU_ROLE,MU.description AS DESC_MENUS,COM.description AS DESC_COMP\n"
                + "from UserLogin AS UL ,UserRole AS UR,RoleGroup AS RG,MenuRole AS MR,Menus AS MU,Component AS COM\n"
                + "WHERE UL.userName = :userName\n"
                + "AND UL.userLoginId = UR.userLogin.userLoginId\n"
                + "AND UR.roleGroup.roleGroupId = RG.roleGroupId\n"
                + "AND RG.roleGroupId = MR.roleGroup.roleGroupId\n"
                + "AND MR.menus.menusId = MU.menusId\n"
                + "AND MU.component.componentId = COM.componentId";
        System.out.println("** usrerLoginRole **");
//        System.out.println("selectQuery "+selectQuery);
//        System.out.println("** "+sessionFactory.getCurrentSession().createQuery(selectQuery).setParameter("userLoginId", userLoginId).list()+" **");
//        Map<String, Object> xx = new HashMap<String, Object>();
        return sessionFactory.getCurrentSession().createQuery(selectQuery).setParameter("userName", userName).list();
    }

    @Override
    public boolean checkLogin(String userName, String password) {
        String selectQuery = "FROM UserLogin WHERE userName = :userName AND password=:password";
        List list = sessionFactory
                .getCurrentSession()
                .createQuery(selectQuery)
                .setParameter("userName", userName)
                .setParameter("password", password)
                .list();
        
        if (list.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

}
