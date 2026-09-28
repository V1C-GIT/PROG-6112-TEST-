

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public abstract class Consoles implements IConsoles 
{
    // Variables
    private String consoleType;
    private String storeName;
    private int totalSales;

    // Constructor
    public Consoles(String consoleType, String storeName, int totalSales) 
    {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    // Getters from interface
    @Override
    public String getConsoleType() 
    {
        return consoleType;
    }

    @Override
    public String getStore() 
    {
        return storeName;
    }

    @Override
    public int getTotalSales() 
    {
        return totalSales;
    }

    public abstract void printReport();
}
