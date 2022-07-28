package com.banking.Banksystem.controller;

import com.banking.Banksystem.dto.NewAccountDTO;
import com.banking.Banksystem.service.NewAccountService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class OpenAccountController {
    @Autowired
    private NewAccountService newAccountService;

    @PostMapping("/openAccount")
    public ResponseEntity<Object>openUserAccount(@RequestBody NewAccountDTO newAccountDTO){
        System.out.println("In openAccountController......");
        return newAccountService.newAccount(newAccountDTO);
    }
}
