package com.banking.Banksystem.controller;

import com.banking.Banksystem.dto.DepositBalanceDTO;
import com.banking.Banksystem.service.DepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepositController {
    @Autowired
    private DepositService depositService;

    @PutMapping("/depositAmount")
    public ResponseEntity<Object>depositAmount(@RequestBody DepositBalanceDTO balanceDTO){
        System.out.println("In Deposit Amount Controller......");
        return depositService.afterDepositBalanceAmount(balanceDTO);
    }
}
