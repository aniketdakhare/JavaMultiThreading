package com.bridgelabz.multithreading.printingmachine.controller;

import com.bridgelabz.multithreading.printingmachine.service.Printer;
import com.bridgelabz.multithreading.printingmachine.service.PrintingMachine;

public class PrintingMachineController
{
    public static void main(String[] args)
    {
        Printer printer = new Printer();
        PrintingMachine firstPrintingMachine = new PrintingMachine(printer);
        PrintingMachine secondPrintingMachine = new PrintingMachine(printer);
        PrintingMachine thirdPrintingMachine = new PrintingMachine(printer);
        firstPrintingMachine.start();
        secondPrintingMachine.start();
        thirdPrintingMachine.start();
    }
}
