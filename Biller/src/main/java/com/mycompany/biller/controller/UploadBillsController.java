/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biller.controller;

import com.mycompany.biller.dto.UploadBills;
import com.mycompany.biller.dto.UserLogin;
import com.mycompany.biller.service.UploadBillsService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ismail
 */
@CrossOrigin
@RestController
@RequestMapping(value = "/uploadBills")
public class UploadBillsController {

    @Autowired
    private UploadBillsService uploadBillsService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    String add(
            @RequestParam(value = "companyName") String companyName,
            @RequestParam(value = "companyNubmer") int companyNubmer,
            @RequestParam(value = "minAmount") double minAmount,
            @RequestParam(value = "maxAmount") double maxAmount,
            @RequestParam(value = "partialyPay") boolean partialyPay,
            @RequestParam(value = "dateOfPost") Date dateOfPost
    ) {
        UploadBills uploadBills = new UploadBills();
        uploadBills.setCompanyName(companyName);
        uploadBills.setCompanyNubmer(companyNubmer);
        uploadBills.setMaxAmount(maxAmount);
        uploadBills.setMinAmount(minAmount);
        uploadBills.setPartialyPay(partialyPay);
        uploadBills.setDateOfPost(dateOfPost);

        uploadBillsService.addUploadBills(uploadBills);
        return "OK";
    }

    @RequestMapping(value = "/upadte", method = RequestMethod.POST)
    public @ResponseBody
    String upadte(
            @RequestParam(value = "id") int id,
            @RequestParam(value = "companyName") String companyName,
            @RequestParam(value = "companyNubmer") int companyNubmer,
            @RequestParam(value = "minAmount") double minAmount,
            @RequestParam(value = "maxAmount") double maxAmount,
            @RequestParam(value = "partialyPay") boolean partialyPay,
            @RequestParam(value = "dateOfPost") Date dateOfPost
    ) {
        UploadBills uploadBills = new UploadBills();
        uploadBills.setId(id);
        uploadBills.setCompanyName(companyName);
        uploadBills.setCompanyNubmer(companyNubmer);
        uploadBills.setMaxAmount(maxAmount);
        uploadBills.setMinAmount(minAmount);
        uploadBills.setPartialyPay(partialyPay);
        uploadBills.setDateOfPost(dateOfPost);

        uploadBillsService.updateUploadBills(uploadBills);
        return "OK";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public @ResponseBody
    String delete(@RequestParam(value = "id") int id) {
        UploadBills uploadBills = new UploadBills();

        uploadBillsService.deleteUploadBills(id);
        return "OK";
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public List<UploadBills> listAll() {

        return uploadBillsService.listAllUploadBills();

    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    @ResponseBody
    public List<UploadBills> findById(@RequestParam(value = "id") int id) {
        return uploadBillsService.findUploadBillsById(id);

    }

}
