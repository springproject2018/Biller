/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.service;

import com.mycompany.biller.DAO.*;
import com.mycompany.biller.model.Person;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface PersonService {
    
    public void addPerson(Person person);

    public void updatePerson(Person person);

    public void deletePerson(int id);

    public List<Person> listAllPerson();

    public List<Person> findById(int id);
    
}
