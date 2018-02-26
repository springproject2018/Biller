/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.dao;

import com.mycompany.biller.dto.GlobalType;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface GlobalTypeDAO {

    public void addGlobalType(GlobalType globalType);

    public void updateGlobalType(GlobalType globalType);

    public void deleteGlobalType(int globalTypeId);

    public List<GlobalType> listAllGlobalType();

    public List<GlobalType> findGlobalTypeById(int globalTypeId);

}
