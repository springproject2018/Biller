/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.service;

import com.mycompany.biller.dao.*;
import com.mycompany.biller.dto.GlobalItem;
import com.mycompany.biller.dto.UploadBills;
import java.util.List;

/**
 *
 * @author ismail
 */
public interface UploadBillsService {

    public void addUploadBills(UploadBills uploadBills);

    public void updateUploadBills(UploadBills uploadBills);

    public void deleteUploadBills(int id);

    public List<UploadBills> listAllUploadBills();

    public List<UploadBills> findUploadBillsById(int id);

    public List<UploadBills> updateUploadBillsList(UploadBills uploadBills);

}
