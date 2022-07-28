package com.banking.Banksystem.service;

import com.banking.Banksystem.dto.BalanceDTO;
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

    public ResponseEntity<Object>afterDepositBalanceAmount(BalanceDTO balanceDTO){
        System.out.println("In Deposit Service");
        if(userRepository.existsByAccountNo(balanceDTO.getAccountNo())){

            User user =userRepository.findUserByAccountNo(balanceDTO.getAccountNo());
            int amount= user.getBalance()+ balanceDTO.getAmount();
            User updateUser= new User(user.getFirstName(), user.getLastName(), user.getAddress(), user.getUsername(), user.getPassword(),
                    user.getAccountNo(), amount);
            userRepository.delete(user);
            userRepository.save(updateUser);
            System.out.println("Updated Amount: " + updateUser.getBalance());
            BalanceDTO newBalanceDTO = new BalanceDTO(updateUser.getAccountNo(), updateUser.getBalance());
            return new ResponseEntity(newBalanceDTO, HttpStatus.OK);
        }
        else{
            return new ResponseEntity("User Not Exists", HttpStatus.BAD_REQUEST);
        }
    }

}
