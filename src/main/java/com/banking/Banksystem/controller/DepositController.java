package com.banking.Banksystem.controller;

import com.banking.Banksystem.dto.BalanceDTO;
import com.banking.Banksystem.service.DepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepositController {
    @Autowired
    private DepositService depositService;

    @PostMapping("/depositAmount")
    public ResponseEntity<Object>depositAmount(@RequestBody BalanceDTO balanceDTO){
        System.out.println("In Deposit Amount Controller......");
        return depositService.afterDepositBalanceAmount(balanceDTO);
    }
}
