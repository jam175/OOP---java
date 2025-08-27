/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicdatatypes;

/**
 *
 * @author User
 */
public class problem5 {
   
    public static void main(String[] args) {     
        System.out.print("Input distance in meters: ");
        double distance = 2500 ;

        System.out.print("Input hour: ");
        int hours = 5;

        System.out.print("Input minutes: ");
        int minutes = 56;

        System.out.print("Input seconds: ");
        int seconds = 23;

     
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;

        
        double metersPerSecond = distance / totalSeconds;
        double kilometersPerHour = (distance / 1000.0) / (totalSeconds / 3600.0);
        double milesPerHour = (distance / 1609.0) / (totalSeconds / 3600.0);

       
        System.out.printf("Your speed in meters/second is %.8f%n", metersPerSecond);
        System.out.printf("Your speed in km/h is %.8f%n", kilometersPerHour);
        System.out.printf("Your speed in miles/h is %.8f%n", milesPerHour);
    }
}


