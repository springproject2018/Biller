/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.DAO;

import com.mycompany.biller.model.Component;
import java.util.List;

/**
 *
 * @author ismail
 */
public interface ComponentDAO {

    public void addComponent(Component component);

    public void updateComponent(Component component);

    public void deleteComponent(String componentId);

    public List<Component> listAllComponent();

    public List<Component> findById(String componentId);
}
