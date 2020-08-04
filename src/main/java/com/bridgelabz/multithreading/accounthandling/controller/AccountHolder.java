package com.bridgelabz.multithreading.accounthandling.controller;

import com.bridgelabz.multithreading.accounthandling.service.Account;
import com.bridgelabz.multithreading.accounthandling.service.Deposit;
import com.bridgelabz.multithreading.accounthandling.service.Withdraw;

public class AccountHolder
{
    public static void main(String[] args)
    {
        Account account = new Account();

        Withdraw withdraw = new Withdraw(account, 8000.0);
        withdraw.start();
        Deposit deposit = new Deposit(account, 9000.0);
        deposit.start();
    }
}
