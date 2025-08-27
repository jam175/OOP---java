/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicdatatypes;

/**
 *
 * @author User
 */
public class prpblem3 {
    public static void main(String[] args) {
        System.out.print("Input the number of minutes: ");
        long minutes = 3456789;     
        int minutesPerDay = 60 * 24;
        int minutesPerYear = minutesPerDay * 365;        
        long years = minutes / minutesPerYear;
        long remainingMinutes = minutes % minutesPerYear;
        long days = remainingMinutes / minutesPerDay;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}


