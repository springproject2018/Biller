/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.dao;

import com.mycompany.biller.dto.Menus;
import java.util.List;

/**
 *
 * @author ismail
 */
public interface MenusDAO {

    public void addMenus(Menus menus);

    public void updateMenus(Menus menus);

    public void deleteMenus(int id);

    public List<Menus> listAllMenus();

    public List<Menus> findById(int id);

}
