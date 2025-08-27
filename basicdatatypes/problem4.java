/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicdatatypes;

/**
 *
 * @author User
 */
public class problem4 { 
    public static void main(String[] args) {
        System.out.print("Input weight in pounds: ");
        double weightInPounds = 452;
        System.out.print("Input height in inches: ");
        double heightInInches = 72;
        double weightInKg = weightInPounds * 0.45359237;
        double heightInMeters = heightInInches * 0.0254;
        double bmi = weightInKg / (heightInMeters * heightInMeters);
        System.out.printf("The Body Mass Index (BMI) is: %.2f\n", bmi);
    }
}





 

