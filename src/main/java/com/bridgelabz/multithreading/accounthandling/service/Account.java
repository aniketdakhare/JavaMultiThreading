package com.bridgelabz.multithreading.accounthandling.service;

public class Account extends Thread
{
    private double accountBalance = 6000.0;

    synchronized void withdraw(double amount)
    {
        System.out.println("Withdrawing amount: " + amount);
        System.out.println("Available balance amount: " + accountBalance);
        if (accountBalance < amount)
        {
            System.out.println("Sorry!! Insufficient balance.");
            System.out.println("Waiting for deposit.");
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        accountBalance = accountBalance - amount;
        System.out.println(amount + "amount withdrawn successfully. ");
        System.out.println("New updated balance amount is: " + accountBalance);
    }

    synchronized void deposit(double amount)
    {
        System.out.println("Depositing amount: " + amount);
        accountBalance = accountBalance + amount;
        System.out.println("Amount deposited successfully.");
        System.out.println("New updated balance amount is: " + accountBalance);
        notify();
    }
}
