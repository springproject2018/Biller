/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.DAO;

import com.mycompany.biller.model.Permissions;
import com.mycompany.biller.model.Role;
import java.util.List;

/**
 *
 * @author ismail
 */
public interface RoleDAO {
    
        
    public void addRole(Role role);

    public void updateRole(Role role);

    public void deleteRole(String roleId);

    public List<Role> listAllRole();

    public List<Role> findById(String roleId);
}
