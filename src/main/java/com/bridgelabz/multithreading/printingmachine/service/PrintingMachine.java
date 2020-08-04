package com.bridgelabz.multithreading.printingmachine.service;

public class PrintingMachine extends Thread
{
    Printer printer;

    public PrintingMachine(Printer printer)
    {
        this.printer = printer;
    }

    @Override
    public void run()
    {
        printer.print();
    }
}
