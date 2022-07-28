package com.banking.Banksystem.dto;

public class WithdrawalBalanceDTO {
    private int balance;
    private String accountNo;

    private int amount;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public WithdrawalBalanceDTO() {
    }

    public WithdrawalBalanceDTO( String accountNo,int balance) {
        this.balance = balance;
        this.accountNo = accountNo;
    }
}
