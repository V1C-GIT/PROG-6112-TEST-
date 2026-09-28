

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class ConsoleSales extends Consoles 
{

    // Constructor
    public ConsoleSales(String consoleType, String storeName, int totalSales) 
    {
        super(consoleType, storeName, totalSales);
    }

    @Override
    public void printReport() 
    {
        System.out.println("\n--- CONSOLE DEVICE SALES REPORT ---");
        System.out.println("Console Type: " + getConsoleType());
        System.out.println("Store Name: " + getStore());
        System.out.println("Total Amount of Sales: R" + getTotalSales());
        System.out.println("-----------------------------------");
    }
}