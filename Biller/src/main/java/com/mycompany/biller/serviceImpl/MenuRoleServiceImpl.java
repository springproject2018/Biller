/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.serviceImpl;

import com.mycompany.biller.dao.MenuRoleDAO;
import com.mycompany.biller.dto.MenuRole;
import com.mycompany.biller.service.MenuRoleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Admin
 */
@Service
@Transactional
public class MenuRoleServiceImpl implements MenuRoleService {

    @Autowired
    private MenuRoleDAO menuRoleDAO;

    @Override
    public void addMenuRole(MenuRole menuRole) {
        menuRoleDAO.addMenuRole(menuRole);
    }

    @Override
    public void updateMenuRole(MenuRole menuRole) {
        menuRoleDAO.updateMenuRole(menuRole);
    }

    @Override
    public void deleteMenuRole(int menuRoleId) {
        menuRoleDAO.deleteMenuRole(menuRoleId);
    }

    @Override
    public List<MenuRole> listAllCompany() {
       return menuRoleDAO.listAllMenuRole();
    }

    @Override
    public List<MenuRole> findById(int menuRole) {
       return menuRoleDAO.findById(menuRole);
    }

}
