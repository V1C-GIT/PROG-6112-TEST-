/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class RunApplication 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Select Console Device Type:");
        System.out.println("1. PlayStation 5");
        System.out.println("2. Xbox Series X");
        System.out.println("3. Nintendo Switch");
        System.out.print("Enter choice (1-3) or type name: ");
        String consoleType = input.nextLine();


        if (consoleType.equals("1")) consoleType = "PlayStation 5";
        else if (consoleType.equals("2")) consoleType = "Xbox Series X";
        else if (consoleType.equals("3")) consoleType = "Nintendo Switch";

        System.out.print("Enter Store Name: ");
        String storeName = input.nextLine();

        System.out.print("Enter Total Amount of Sales: ");
        int totalSales = input.nextInt();


        ConsoleSales sale = new ConsoleSales(consoleType, storeName, totalSales);
        

        sale.printReport();

        input.close();
    }
}