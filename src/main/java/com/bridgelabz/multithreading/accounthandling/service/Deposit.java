package com.bridgelabz.multithreading.accounthandling.service;

public class Deposit extends Thread
{
    private final Account account;
    private final double amount;

    public Deposit(Account account, double amount)
    {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run()
    {
        account.deposit(amount);
    }
}
