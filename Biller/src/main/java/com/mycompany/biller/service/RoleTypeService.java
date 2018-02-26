/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.service;

import com.mycompany.biller.dto.RoleType;
import java.util.List;

/**
 *
 * @author ismail
 */
public interface RoleTypeService {

    public void addRoleType(RoleType type);

    public void updateRoleType(RoleType type);

    public void deleteRoleType(int id);

    public List<RoleType> listAllRoleType();

    public List<RoleType> findRoleTypeById(int id);
}
