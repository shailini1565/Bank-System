package com.banking.Banksystem.repository;

import com.banking.Banksystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    boolean existsByUsername(String username);
    boolean existsByAccountNo(String accountNo);

     User findUserByAccountNo(String accountNo);
}
