/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.serviceImpl;

import com.mycompany.biller.dao.ComponentDAO;
import com.mycompany.biller.dao.GlobalItemDAO;
import com.mycompany.biller.dao.GlobalTypeDAO;
import com.mycompany.biller.dto.Component;
import com.mycompany.biller.dto.GlobalItem;
import com.mycompany.biller.dto.GlobalType;
import com.mycompany.biller.service.ComponentService;
import com.mycompany.biller.service.GlobalItemService;
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
public class GlobalItemServiceImpl implements GlobalItemService {

    @Autowired
    private GlobalItemDAO globalItemDAO;

    @Override
    public void addGlobalItem(GlobalItem globalItem) {
        globalItemDAO.addGlobalItem(globalItem);
    }

    @Override
    public void updateGlobalItem(GlobalItem globalItem) {
        globalItemDAO.updateGlobalItem(globalItem);
    }

    @Override
    public void deleteGlobalItem(int globalItemId) {
        globalItemDAO.deleteGlobalItem(globalItemId);
    }

    @Override
    public List<GlobalItem> listAllGlobalItem() {
        return globalItemDAO.listAllGlobalItem();
    }

    @Override
    public List<GlobalItem> findGlobalItemById(int globalItemId) {
        return globalItemDAO.findGlobalItemById(globalItemId);
    }

}
