/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.dao;

import com.mycompany.biller.dto.Person;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface PersonDAO {
    
    public void addPerson(Person person);

    public void updatePerson(Person person);

    public void deletePerson(int id);

    public List<Person> listAllPerson();

    public List<Person> findById(int id);
    
}
