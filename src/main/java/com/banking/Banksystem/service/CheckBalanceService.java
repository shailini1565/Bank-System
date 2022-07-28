package com.banking.Banksystem.service;

import com.banking.Banksystem.dto.CheckBalanceDTO;
import com.banking.Banksystem.model.User;
import com.banking.Banksystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CheckBalanceService {
    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<Object>remainingBalance(CheckBalanceDTO checkBalanceDTO){
        System.out.println("In Check Balance Service");
        if(userRepository.existsByAccountNo(checkBalanceDTO.getAccountNo())){
            User user =userRepository.findUserByAccountNo(checkBalanceDTO.getAccountNo());
            int amount= user.getBalance();
            CheckBalanceDTO balanceDTO= new CheckBalanceDTO(user.getAccountNo(),amount);
            return new ResponseEntity(balanceDTO,HttpStatus.OK);
        }
        else{
            return new ResponseEntity("Account Not Exists", HttpStatus.BAD_REQUEST);
        }
    }
}
