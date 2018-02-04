/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.DAO;

import com.mycompany.biller.model.MenuRole;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface MenuRoleDAO {

    public void addMenuRole(MenuRole menuRole);

    public void updateMenuRole(MenuRole menuRole);

    public void deleteMenuRole(String menuRoleId);

    public List<MenuRole> listAllCompany();

    public List<MenuRole> findById(String menuRole);

}
