/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.serviceImpl;

import com.mycompany.biller.dao.TypeDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.mycompany.biller.dao.UserRoleDAO;
import com.mycompany.biller.dto.Type;
import com.mycompany.biller.dto.UserRole;
import com.mycompany.biller.service.TypeService;
import com.mycompany.biller.service.UserRoleService;

/**
 *
 * @author Admin
 */
@Service
@Transactional
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeDAO typeDAO;

    @Override
    public void addType(Type type) {
       typeDAO.addType(type);
    }

    @Override
    public void updateType(Type type) {
        typeDAO.updateType(type);
    }

    @Override
    public void deleteType(int id) {
       typeDAO.deleteType(id);
    }

    @Override
    public List<Type> listAllType() {
        return typeDAO.listAllType();
    }

    @Override
    public List<Type> findById(int id) {
        return typeDAO.findById(id);
    }


   

  

}
