/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.serviceImpl;

import com.mycompany.biller.dao.UploadBillsDAO;
import com.mycompany.biller.dto.GlobalItem;
import com.mycompany.biller.dto.UploadBills;
import com.mycompany.biller.service.UploadBillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ismail
 */
@Transactional
@Service
public class UploadBillsServiceImpl implements UploadBillsService {

    @Autowired
    private UploadBillsDAO uploadBillsDAO;

    @Override
    public void addUploadBills(UploadBills uploadBills) {
        uploadBillsDAO.addUploadBills(uploadBills);
    }

    @Override
    public void updateUploadBills(UploadBills uploadBills) {
        uploadBillsDAO.updateUploadBills(uploadBills);
    }

    @Override
    public void deleteUploadBills(int id) {
        uploadBillsDAO.deleteUploadBills(id);
    }

    @Override
    public List<UploadBills> listAllUploadBills() {
        return uploadBillsDAO.listAllUploadBills();
    }

    @Override
    public List<UploadBills> findUploadBillsById(int id) {
        return uploadBillsDAO.findUploadBillsById(id);
    }

    @Override
    public List<UploadBills> updateUploadBillsList(UploadBills uploadBills) {
        return uploadBillsDAO.updateUploadBillsList(uploadBills);
    }

}
