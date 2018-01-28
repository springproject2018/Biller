/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.DAO;

import com.mycompany.biller.model.Users;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface UserDAO {

    public void addUsers(Users u);

    public void updateUsers(Users u);

    public void deleteUsers(int id);

    public List<Users> listAllUsers();

    public List<Users> findById(int id);

}
