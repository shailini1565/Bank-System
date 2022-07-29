package com.banking.Banksystem.dto;

public class DepositBalanceDTO {

   private String accountNo;
   private int balance;
   private int addAmount;
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

    public int getAddAmount() {
        return addAmount;
    }

    public void setAmount(int addAmount) {
        this.addAmount = addAmount;
    }

    public DepositBalanceDTO() {
    }

    public DepositBalanceDTO(String accountNo, int balance, int addAmount) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.addAmount = addAmount;
    }
}
