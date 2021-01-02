/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52;

import java.util.Scanner;

/**
 *
 * @author Angel2014fly
 */
public class JavaApplication52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
               
        Scanner console = new Scanner(System.in);
        
        int number;
        int reverse =0;
        
        System.out.print("Enter the number ");
        number = console.nextInt();
        
        int temp = number;
        int remainder =0;
        
        while(temp>0)
        {
            remainder =temp %10;
            reverse = reverse *10+remainder;
            temp /=10;
        }
        System.out.println("Reverse of " +number + " is " +reverse);
    }
    
}
