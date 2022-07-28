package com.banking.Banksystem.service;

import com.banking.Banksystem.dto.BalanceDTO;
import com.banking.Banksystem.dto.WithdrawalBalanceDTO;
import com.banking.Banksystem.model.User;
import com.banking.Banksystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class WithdrawalService {
    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<Object> afterWithDrawalBalanceAmount(WithdrawalBalanceDTO withdrawalBalanceDTO){
        System.out.println("In Withdrawal Service");
        if(userRepository.existsByAccountNo(withdrawalBalanceDTO.getAccountNo())) {

            User user = userRepository.findUserByAccountNo(withdrawalBalanceDTO.getAccountNo());
            if (user.getBalance() >= withdrawalBalanceDTO.getAmount()) {
                int amount = user.getBalance() - withdrawalBalanceDTO.getAmount();
                User updateUser = new User(user.getFirstName(), user.getLastName(), user.getAddress(), user.getUsername(), user.getPassword(),
                        user.getAccountNo(), amount);
                userRepository.delete(user);
                userRepository.save(updateUser);
                System.out.println("Updated Amount: " + updateUser.getBalance());
                BalanceDTO newBalanceDTO = new BalanceDTO(user.getAccountNo(), updateUser.getBalance());
                return new ResponseEntity(newBalanceDTO, HttpStatus.OK);
            }
            else{
                return new ResponseEntity("That much amount not exists", HttpStatus.BAD_REQUEST);
            }
        }
        else{
            return new ResponseEntity("User Not Exists", HttpStatus.BAD_REQUEST);
        }
    }
}
