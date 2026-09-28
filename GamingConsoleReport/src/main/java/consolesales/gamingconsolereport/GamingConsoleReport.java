/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package consolesales.gamingconsolereport;

/**
 *
 * @author Student
 */
public class GamingConsoleReport 
{
    public static void main(String[] args) 
    {
        // Array to store the 3 city names
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        
        // Array to store the 3 console types
        String[] consoles = {"PS5", "XBOX", "SWITCH"};
        
        // This 2D array stores sales data: [row = city][column = console]
        int[][] sales = {
            {1000, 2000, 3000}, 
            {2000, 3000, 4000}, 
            {1500, 1100, 1200} 
        };
        
        int[] cityTotals = new int[cities.length]; 
        
        System.out.println("----------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("----------------------------------------");
        
        System.out.print("\t\t");
        for(String console : consoles) 
        { 
            System.out.print(console + "\t");
        }
        System.out.println();

        for(int i = 0; i < cities.length; i++) 
        {
            System.out.print(cities[i] + "\t"); 
            int total = 0; 
            
            for(int j = 0; j < consoles.length; j++) 
            {
                System.out.print(sales[i][j] + "\t"); 
                total += sales[i][j]; 
            }
            cityTotals[i] = total; 
            System.out.println(); 
        }
        System.out.println("----------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("----------------------------------------");
        
        int maxSales = cityTotals[0]; 
        int maxIndex = 0;
        
        for(int i = 0; i < cities.length; i++) {
            System.out.println(cities[i] + "\t" + cityTotals[i]);
            
            if(cityTotals[i] > maxSales) {
                maxSales = cityTotals[i];
                maxIndex = i;
            }
        }
        
        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + cities[maxIndex]);
        System.out.println("----------------------------------------");
    }
}