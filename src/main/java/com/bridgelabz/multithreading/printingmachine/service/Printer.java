package com.bridgelabz.multithreading.printingmachine.service;

public class Printer extends Thread
{
    synchronized void print()
    {
        for (int i = 0; i < 6; i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(700);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
