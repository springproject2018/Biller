/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.service;

import com.mycompany.biller.DAO.*;
import com.mycompany.biller.model.UserLogin;
import java.util.List;

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

}
