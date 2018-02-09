/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.mycompany.biller.dao.UserRoleDAO;
import com.mycompany.biller.dto.UserRole;
import com.mycompany.biller.service.UserRoleService;

/**
 *
 * @author Admin
 */
@Service
@Transactional
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleDAO userRoleDAO;

    @Override
    public void addUserRole(UserRole userRole) {
        userRoleDAO.addUserRole(userRole);
    }

    @Override
    public void updateUserRole(UserRole userRole) {
        userRoleDAO.updateUserRole(userRole);
    }

    @Override
    public void deleteUserRole(int id) {
       userRoleDAO.deleteUserRole(id);
    }

    @Override
    public List<UserRole> listAllUserRole() {
        return userRoleDAO.listAllUserRole();
    }

    @Override
    public List<UserRole> findById(int id) {
        return userRoleDAO.findById(id);
    }

   

  

}
