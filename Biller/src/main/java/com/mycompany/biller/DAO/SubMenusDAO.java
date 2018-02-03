/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.DAO;

import com.mycompany.biller.model.Role;
import com.mycompany.biller.model.SubMenus;
import java.util.List;

/**
 *
 * @author ismail
 */
public interface SubMenusDAO {

    public void addSubMenus(SubMenus subMenus);

    public void updateSubMenus(SubMenus subMenus);

    public void deleteSubMenus(String menuId);

    public List<SubMenus> listAllSubMenus();

    public List<SubMenus> findById(String menuId);
}
