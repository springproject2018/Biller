/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.service;

import com.mycompany.biller.DAO.*;
import com.mycompany.biller.model.RoleGroup;
import java.util.List;

/**
 *
 * @author ismail
 */
public interface RoleGroupService {
    public void addRoleGroup(RoleGroup roleGroup);

    public void updateRoleGroup(RoleGroup roleGroup);

    public void deleteRoleGroup(int id);

    public List<RoleGroup> listAllRoleGroup();

    public List<RoleGroup> findById(int id);
}
