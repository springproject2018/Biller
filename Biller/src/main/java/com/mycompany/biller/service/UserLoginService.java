/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.service;

import com.mycompany.biller.dto.UserLogin;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public interface UserLoginService {

    public void addUserLogin(UserLogin userLogin);

    public void updateUserLogin(UserLogin userLogin);

    public void deleteUserLogin(int id);

    public List<UserLogin> listAllUserLogin();

    public List<UserLogin> findById(int id);

    public List<Object> usrerLoginRole(String userName);
    
    public boolean checkLogin (String userName, String password);

}
