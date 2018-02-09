/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.serviceImpl;

import com.mycompany.biller.dao.ComponentDAO;
import com.mycompany.biller.dto.Component;
import com.mycompany.biller.service.ComponentService;
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
public class ComponentServiceImpl implements ComponentService {

    @Autowired
    private ComponentDAO componentDAO;

    @Override
    public void addComponent(Component component) {
        componentDAO.addComponent(component);
    }

    @Override
    public void updateComponent(Component component) {
        componentDAO.updateComponent(component);
    }

    @Override
    public void deleteComponent(int componentId) {
        componentDAO.deleteComponent(componentId);
    }

    @Override
    public List<Component> listAllComponent() {
        return componentDAO.listAllComponent();
    }

    @Override
    public List<Component> findById(int componentId) {
        return componentDAO.findById(componentId);
    }

}
