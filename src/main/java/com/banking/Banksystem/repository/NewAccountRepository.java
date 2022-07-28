package com.banking.Banksystem.repository;

import com.banking.Banksystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewAccountRepository extends JpaRepository<User,Integer> {

}
