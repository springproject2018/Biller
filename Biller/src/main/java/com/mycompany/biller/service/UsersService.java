/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.service;

import com.mycompany.biller.model.UserLogin;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface UsersService {
    
    public void addUsers(UserLogin u);

    public void updateUsers(UserLogin u);

    public void deleteUsers(int id);

    public List<UserLogin> listAllUsers();

    public List<UserLogin> findById(int id);
    
}
