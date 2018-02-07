/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.serviceImpl;

import com.mycompany.biller.DAO.RoleGroupDAO;
import com.mycompany.biller.model.RoleGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.mycompany.biller.service.RoleGroupService;
import java.util.List;

/**
 *
 * @author Admin
 */
@Service
@Transactional
public class RoleGroupServiceImpl implements RoleGroupService {

    @Autowired
    private RoleGroupDAO roleGroupDAO;

    @Override
    public void addRoleGroup(RoleGroup roleGroup) {
        roleGroupDAO.addRoleGroup(roleGroup);
    }

    @Override
    public void updateRoleGroup(RoleGroup roleGroup) {
        roleGroupDAO.updateRoleGroup(roleGroup);
    }

    @Override
    public void deleteRoleGroup(int id) {
        roleGroupDAO.deleteRoleGroup(id);
    }

    @Override
    public List<RoleGroup> listAllRoleGroup() {
        return roleGroupDAO.listAllRoleGroup();
    }

    @Override
    public List<RoleGroup> findById(int id) {
        return roleGroupDAO.findById(id);
    }




   

  

}
