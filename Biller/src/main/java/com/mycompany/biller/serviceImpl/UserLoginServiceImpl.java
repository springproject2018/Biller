/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.serviceImpl;

import com.mycompany.biller.dto.UserLogin;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.mycompany.biller.dao.UserLoginDAO;
import com.mycompany.biller.service.UserLoginService;
import java.util.Map;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author Admin
 */
@Service
@Transactional
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    private UserLoginDAO userLoginDAO;
    
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void addUserLogin(UserLogin userLogin) {
//        userLogin.setPassword(passwordEncoder.encode(userLogin.getPassword()));
        userLoginDAO.addUserLogin(userLogin);
    }

    @Override
    public void updateUserLogin(UserLogin userLogin) {
        userLoginDAO.updateUserLogin(userLogin);
    }

    @Override
    public void deleteUserLogin(int id) {
        userLoginDAO.deleteUserLogin(id);
    }

    @Override
    public List<UserLogin> listAllUserLogin() {
        return userLoginDAO.listAllUserLogin();
    }

    @Override
    public List<UserLogin> findById(int id) {
        return userLoginDAO.findById(id);
    }

    @Override
    public List<Object> usrerLoginRole(String userName) {
       return userLoginDAO.usrerLoginRole( userName);
    }

    @Override
    public boolean checkLogin(String userName, String password) {
        
        return userLoginDAO.checkLogin(userName, password);
//                return userLoginDAO.checkLogin(userName, passwordEncoder.encode(password));

    }

}
