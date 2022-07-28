package com.banking.Banksystem.controller;

import com.banking.Banksystem.dto.CheckBalanceDTO;
import com.banking.Banksystem.service.CheckBalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckBalanceController {

    @Autowired
    private CheckBalanceService checkBalanceService;

    @PostMapping("/checkBalance")
    public ResponseEntity<Object> checkBalance(@RequestBody CheckBalanceDTO checkBalanceDTO){
        System.out.println("In Check Balance Controller......");
        return checkBalanceService.remainingBalance(checkBalanceDTO);
    }

}
