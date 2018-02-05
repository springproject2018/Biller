///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.mycompany.biller.serviceImpl;
//
//import com.mycompany.biller.model.UserLogin;
//import com.mycompany.biller.service.UsersService;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import com.mycompany.biller.DAO.UserLoginDAO;
//
///**
// *
// * @author Admin
// */
//@Service
//@Transactional
//public class UserServiceImpl implements UsersService {
//
//
//    
//
//    @Autowired
//    private UserLoginDAO userDAO;
//
//    public void setUserDAO(UserLoginDAO userDAO) {
//        this.userDAO = userDAO;
//    }
//
//    @Override
//    public void addUsers(UserLogin u) {
//        userDAO.addUsers(u);
//    }
//
//    @Override
//    public void updateUsers(UserLogin u) {
//        userDAO.updateUsers(u);
//    }
//
//    @Override
//    public void deleteUsers(int id) {
//        userDAO.deleteUsers(id);
//        
//    }
//
//    @Override
//    public List<UserLogin> listAllUsers() {
//       return userDAO.listAllUsers();
//    }
//
//    @Override
//    public List<UserLogin> findById(int id) {
//        return userDAO.findById(id);
//    }
//
//}
