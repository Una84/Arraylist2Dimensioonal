/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylist2dimensional;

/**
 *
 * @author RC_Student_lab
 */
public class Arraylist2Dimensional {

    public static void main(String[] args) {
         String[] month = {"JAN", "FEB", "MAR"};
        String[] cities = {"JHB", "DBN", "CTN", "PE"};
        
        String[][] array = {
            {"128Km", "135Km", "139Km"},  // JHB
            {"135Km", "129Km", "175Km"},  // DBN
            {"129Km", "130Km", "185Km"},  // CTN
            {"195Km", "155Km", "221Km"},   // PE
        };

        // Report Header
        System.out.println("*********************************");
        System.out.println("SPEEDING FINES REPORT");
        System.out.println("*********************************");

        // Print the header
        System.out.printf("%-8s", "City");
        for (String m : month) {
            System.out.printf("%-10s", m);
        }
        System.out.println();

        // Variables to track max and min speeds
        int maxSpeed = Integer.MIN_VALUE;
        int minSpeed = Integer.MAX_VALUE;

        // Print each row of data
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-8s", cities[i]);
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%-10s", array[i][j]); 
                
                // Remove "Km" and parse number
                int speed = Integer.parseInt(array[i][j].replace("Km", ""));
                
                // Update max and min
                if (speed > maxSpeed) {
                    maxSpeed = speed;
                }
                if (speed < minSpeed) {
                    minSpeed = speed;
                }
            }
            System.out.println();
        }
         // Monthly Totals (label only)
        System.out.println("*********************************");
        System.out.println("SPEEDING FINES STATISTICS");
       


        // Print max and min speeds
       System.out.println("*********************************");
        System.out.println("Maximum speed captured: " + maxSpeed + "Km");
        System.out.println("Minimum speed captured: " + minSpeed + "Km");
        System.out.println("*********************************");
    }
}

    
