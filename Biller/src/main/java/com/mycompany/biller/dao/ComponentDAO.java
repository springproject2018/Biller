/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.dao;

import com.mycompany.biller.dto.Component;
import java.util.List;

/**
 *
 * @author ismail
 */
public interface ComponentDAO {

    public void addComponent(Component component);

    public void updateComponent(Component component);

    public void deleteComponent(int componentId);

    public List<Component> listAllComponent();

    public List<Component> findById(int componentId);
}
