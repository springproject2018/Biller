/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.service;

import com.mycompany.biller.dto.MenuRole;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface MenuRoleService {

    public void addMenuRole(MenuRole menuRole);

    public void updateMenuRole(MenuRole menuRole);

    public void deleteMenuRole(int menuRoleId);

    public List<MenuRole> listAllCompany();

    public List<MenuRole> findById(int menuRole);

}
