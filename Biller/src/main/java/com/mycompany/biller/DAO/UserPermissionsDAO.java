/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.DAO;

import com.mycompany.biller.model.UserPermissions;
import com.mycompany.biller.model.Users;
import java.util.List;

/**
 *
 * @author ismail
 */
public interface UserPermissionsDAO {

    public void addUserPermissions(UserPermissions userPermissions);

    public void updateUserPermissions(UserPermissions userPermissions);

    public void deleteUserPermissions(int userPermissionId);

    public List<UserPermissions> listAllUserPermissions();

    public List<UserPermissions> findById(int userPermissionId);
}
