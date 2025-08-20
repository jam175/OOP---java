/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author User
 */
public class problem3 {
    public static void main(String[] args) {
    
        
       
        int num1 = 25;
        int num2 = 78;      
        int num3 = 87;

        
        int greatest;
        if (num1 >= num2 && num1 >= num3) {
            greatest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }

        
        System.out.println("The greatest number is: " + greatest);
    }
}

 
