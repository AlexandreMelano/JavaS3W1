/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time1;

import java.util.Scanner;

/**
 *
 * @author User1
 */
public class Time1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Time javaTime = new Time();
        System.out.printf("The current javaTime = %s%n", javaTime.toMilitaryTime());
        
        javaTime.setTime(14, 30, 00);
        System.out.printf("The new javaTime = %s%n", javaTime.toMilitaryTime());
        
        try{
            javaTime.setTime(49, 20, 02);
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("The exception caught was %s%n", e.getMessage());
        }
        /**
         * Code that will continously ask the user for the time until a valid time is entered.
         * If the user provides invalid input print a message to the screen explaining why the time is invalid
         * 
         */
        boolean invalidInput = true;
       for (int x =0; x < 2; x ++)
       {
        do
        {
            Scanner keyboard = new Scanner (System.in);
            
            System.out.print("Please enter the hours: ");
            int hours = keyboard.nextInt();
            
            System.out.print("Please enter the minutes: ");
            int minutes = keyboard.nextInt();
            
            System.out.print("Please enter the seconds: ");
            int seconds = keyboard.nextInt();
            try{
           
                javaTime.setTime(hours, minutes, seconds);
                invalidInput = false;
        }//end of try
            
        catch (IllegalArgumentException e)
        {
            System.out.printf("The exception caught was %s%n", e.getMessage());
        }
        }   
         while (invalidInput);
        
        System.out.printf("%nThe valid time entered was %s%n", javaTime.toMilitaryTime());
        
        System.out.printf("%n In standard time that is %s%n", javaTime.toStandardTime());
        
        
        
       
    }
    }
}
