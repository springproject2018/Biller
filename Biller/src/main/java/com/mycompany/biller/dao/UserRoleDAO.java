/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.dao;

import com.mycompany.biller.dto.UserRole;
import java.util.List;

/**
 *
 * @author ismail
 */
public interface UserRoleDAO {

    public void addUserRole(UserRole userRole);

    public void updateUserRole(UserRole userRole);

    public void deleteUserRole(int id);

    public List<UserRole> listAllUserRole();

    public List<UserRole> findById(int id);
}
