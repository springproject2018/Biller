/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.DAO;

import com.mycompany.biller.model.Type;
import java.util.List;

/**
 *
 * @author ismail
 */
public interface TypeDAO {

    public void addType(Type type);

    public void updateType(Type type);

    public void deleteType(int id);

    public List<Type> listAllType();

    public List<Type> findById(int id);
}
