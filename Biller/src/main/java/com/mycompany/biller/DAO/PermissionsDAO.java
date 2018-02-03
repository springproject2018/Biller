/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.DAO;

import com.mycompany.biller.model.PartyRole;
import com.mycompany.biller.model.Permissions;
import java.util.List;

/**
 *
 * @author ismail
 */
public interface PermissionsDAO {
    
    public void addPermissions(Permissions permissions);

    public void updatePermissions(Permissions permissions);

    public void deletePermissions(String permissionsId);

    public List<Permissions> listAllPermissions();

    public List<Permissions> findById(String permissionsId);
    
}
