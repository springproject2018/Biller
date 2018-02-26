/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.dao;

import com.mycompany.biller.dto.GlobalItem;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface GlobalItemDAO {

    public void addGlobalItem(GlobalItem globalItem);

    public void updateGlobalItem(GlobalItem globalItem);

    public void deleteGlobalItem(int globalItemId);

    public List<GlobalItem > listAllGlobalItem();

    public List<GlobalItem > findGlobalItemById(int globalItemId);

}
