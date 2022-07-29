package com.banking.Banksystem.dto;

public class WithdrawalBalanceDTO {
    private String accountNo;
    private int balance;
    private int withdrawalAmount;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public int getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public void setWithdrawalAmount(int withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public WithdrawalBalanceDTO() {
    }

    public WithdrawalBalanceDTO( String accountNo,int balance, int withdrawalAmount) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.withdrawalAmount = withdrawalAmount;
    }
}
