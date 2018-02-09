/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.serviceImpl;

import com.mycompany.biller.dao.PersonDAO;
import com.mycompany.biller.dto.Person;
import com.mycompany.biller.service.PersonService;
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
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDAO personDAO;

    @Override
    public void addPerson(Person person) {
        personDAO.addPerson(person);
    }

    @Override
    public void updatePerson(Person person) {
        personDAO.updatePerson(person);
    }

    @Override
    public void deletePerson(int id) {
       personDAO.deletePerson(id);
    }

    @Override
    public List<Person> listAllPerson() {
        return personDAO.listAllPerson();
    }

    @Override
    public List<Person> findById(int id) {
        return personDAO.findById(id);
    }


 
  




   

  

}
