/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.serviceImpl;

import com.mycompany.biller.dao.UserPreferenceDAO;
import com.mycompany.biller.dto.UserPreference;
import com.mycompany.biller.service.UserPreferenceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ismail
 */
@Service
@Transactional
public class UserPreferenceServiceImpl implements UserPreferenceService {

    @Autowired
    private UserPreferenceDAO userPreferenceDAO;

    @Override
    public void add(UserPreference userPreference) {
        userPreferenceDAO.add(userPreference);
    }

    @Override
    public void update(UserPreference userPreference) {
        userPreferenceDAO.update(userPreference);
    }

    @Override
    public void delete(int id) {
        userPreferenceDAO.delete(id);
    }

    @Override
    public List<UserPreference> listAll(String userName) {
        return userPreferenceDAO.listAll(userName);
    }

    @Override
    public List<UserPreference> findById(String userName, String key) {
        return userPreferenceDAO.findById(userName, key);
    }

}
