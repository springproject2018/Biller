/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.mycompany.biller.dao.UserRoleDAO;
import com.mycompany.biller.dto.RoleType;
import com.mycompany.biller.dto.UserRole;
import com.mycompany.biller.service.UserRoleService;
import com.mycompany.biller.dao.RoleTypeDAO;
import com.mycompany.biller.service.RoleTypeService;

/**
 *
 * @author Admin
 */
@Service
@Transactional
public class RoleTypeServiceImpl implements RoleTypeService {

    @Autowired
    private RoleTypeDAO typeDAO;

    @Override
    public void addRoleType(RoleType type) {
       typeDAO.addRoleType(type);
    }

    @Override
    public void updateRoleType(RoleType type) {
        typeDAO.updateRoleType(type);
    }

    @Override
    public void deleteRoleType(int id) {
       typeDAO.deleteRoleType(id);
    }

    @Override
    public List<RoleType> listAllRoleType() {
        return typeDAO.listAllRoleType();
    }

    @Override
    public List<RoleType> findRoleTypeById(int id) {
        return typeDAO.findRoleTypeById(id);
    }


   

  

}
