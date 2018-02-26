/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.serviceImpl;

import com.mycompany.biller.dao.ComponentDAO;
import com.mycompany.biller.dao.GlobalTypeDAO;
import com.mycompany.biller.dto.Component;
import com.mycompany.biller.dto.GlobalType;
import com.mycompany.biller.service.ComponentService;
import com.mycompany.biller.service.GlobalTypeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Admin
 */
@Service
@Transactional
public class GlobalTypeServiceImpl implements GlobalTypeService {

    @Autowired
    private GlobalTypeDAO globalTypeDAO;

    @Override
    public void addGlobalType(GlobalType globalType) {
        globalTypeDAO.addGlobalType(globalType);
    }

    @Override
    public void updateGlobalType(GlobalType globalType) {
        globalTypeDAO.updateGlobalType(globalType);
    }

    @Override
    public void deleteGlobalType(int globalTypeId) {
        globalTypeDAO.deleteGlobalType(globalTypeId);
    }

    @Override
    public List<GlobalType> listAllGlobalType() {
        return globalTypeDAO.listAllGlobalType();
    }

    @Override
    public List<GlobalType> findGlobalTypeById(int globalTypeId) {
        return globalTypeDAO.findGlobalTypeById(globalTypeId);
    }

}
