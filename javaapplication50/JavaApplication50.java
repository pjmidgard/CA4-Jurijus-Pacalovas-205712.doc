/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication50;
import java.io.BufferedWriter;// Writes text to character output stream.
import java.util.Scanner; // Import the Scanner class to read text files.
/**
 *
 * @author Angel2014fly
 */
public class JavaApplication50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner console = new Scanner(System.in);
        int number;
        char choice;
        int even = 0;
        int odd = 0;
        do
        {
            System.out.print("Enter any number ");
            number = console.nextInt();
            if( number % 2 == 0)
            {
                even += number;
            }
            else
            {
                odd += number;
            }
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
        }while(choice=='y' || choice == 'Y');
        System.out.println("Sum of even numbers: " + even);
        System.out.println("Sum of odd numbers: " + odd);
        
           int rows = 5;
    for (int i = 1; i <= rows; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print("* ");
      }
      System.out.println();
    }
    
    
    // int data;
Scanner input= new Scanner(System.in);
    
    //int data;
    int count = 0;
    int negative=0;
    int positive =0;
    
    System.out.print("Enter an integer (Program ends if enter 0): ");
    int data = input.nextInt();
    
    
    
    while (data !=0) {
    
    System.out.print("Enter an integer (Program ends if enter 0): ");
    data=input.nextInt();
    //count++;
    if (data < 0){
    negative++;
    }else if (data > 0){
    positive++;
    }
    count++;
  }
    System.out.println(positive + " positive numbers");
    System.out.println(negative + " negative numbers");
    
 }

    }  

  }


        
    
    
   
