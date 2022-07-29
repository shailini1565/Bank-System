package com.banking.Banksystem.service;

import com.banking.Banksystem.dto.DepositBalanceDTO;
import com.banking.Banksystem.model.User;
import com.banking.Banksystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DepositService {

    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<Object>afterDepositBalanceAmount(DepositBalanceDTO depositBalanceDTO){
        System.out.println("In Deposit Service");
        if(userRepository.existsByAccountNo(depositBalanceDTO.getAccountNo())){

            User user =userRepository.findUserByAccountNo(depositBalanceDTO.getAccountNo());
            int depositAmount= user.getBalance()+ depositBalanceDTO.getAddAmount();
            user.setBalance(depositAmount);
            userRepository.save(user);
            userRepository.save(user);
            System.out.println("Updated Amount: " + user.getBalance());
            DepositBalanceDTO newBalanceDTO = new DepositBalanceDTO(user.getAccountNo(), user.getBalance(), depositBalanceDTO.getAddAmount());
            return new ResponseEntity(newBalanceDTO, HttpStatus.OK);
        }
        else{
            return new ResponseEntity("User Not Exists", HttpStatus.BAD_REQUEST);
        }
    }

}
