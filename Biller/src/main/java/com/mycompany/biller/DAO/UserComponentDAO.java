/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.DAO;

import com.mycompany.biller.model.SubMenus;
import com.mycompany.biller.model.UserComponent;
import java.util.List;

/**
 *
 * @author ismail
 */
public interface UserComponentDAO {
 
    public void addUserComponent(UserComponent userComponent);

    public void updateUserComponent(UserComponent userComponent);

    public void deleteUserComponent(int userComponentId);

    public List<UserComponent> listAllUserComponent();

    public List<UserComponent> findById(int userComponentId);

    
}
