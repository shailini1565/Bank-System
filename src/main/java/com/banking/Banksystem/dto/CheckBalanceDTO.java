package com.banking.Banksystem.dto;

public class CheckBalanceDTO {
    private String accountNo;
    private int balance;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public CheckBalanceDTO() {
    }

    public CheckBalanceDTO(String accountNo,int balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }
}
