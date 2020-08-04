package com.bridgelabz.multithreading.accounthandling.service;

public class Withdraw extends Thread
{
    private final Account account;
    private final double amount;

    public Withdraw(Account account, double amount)
    {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run()
    {
        account.withdraw(amount);
    }
}
