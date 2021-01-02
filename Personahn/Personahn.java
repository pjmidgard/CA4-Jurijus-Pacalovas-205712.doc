/*
I enjoy writing programs. Reverso Dictionary
E.G. You guys are supposed to be writing programs. Reverso Dictionary
A programming language is a notation for writing programs. 
Writing programs: Programmers may use a variety of computer languages for these tasks, including C++, Java, and many others.
Early 17th century (in the sense ‘written notice’): via late Latin from Greek program, from prographein ‘write publicly’, from pro ‘before’ + graphein ‘write’. Oxford Dictionary
Java
 1) Create a new project and add a class called “Person”. Include properties for a) name –
should be text; b) age – should be an integer and c) height – should allow decimals
Add getter and setter methods for each property
Add a “Speak()” method. This method should return a String that says “Hello, my name
is <person’s name goes here>”
Add a SEPARATE main() class and create a loop that will prompt the user for a name, age
and height and create a Person using this detail.
Call the person’s speak() method to test your program

2)
FOR SUBMISSION!
Using the “Shape” project from class, add a Circle class with methods to getArea() and
getPerimeter().
A Circle will have 1 property called “radius”
Include a constructor that will create a Circle given the radius
Submit the “Shape” project with the Circle class added to it !

 */
package personahn;

import Person.Circle;
import java.util.Scanner;

/**
 *
 * @author Jurijus Pacalovas
 */
public class Personahn {

    /**
     * @param args the command line arguments
     */
    
      public static String GetName(String name) {
    
    return name;
}
//Add a “Speak()” method. This method should return a String that says “Hello, my name
//is <person’s name goes here>”    
    
    public static void main(String[] args) {
       
        //Add a SEPARATE main() class and create a loop that will prompt the user for a name, age
//and height and create a Person using this detail.
//Call the person’s speak() method to test your program
        Person MyPerson = new Person();
        
        Person Person2 = new Person();
        Person Person3 = new Person();  
        Person Person4 = new Person(); 
        
        
        System.out.println("The age of my Person is " + MyPerson.getAge());
        System.out.println("The height of my Person is " + MyPerson.getHeight());
                
        
        System.out.println("The age of Person 2 is " + Person2.getAge());
        
         
        MyPerson.setHeight(9);
        System.out.println("The age of my Person after I changed it is " + MyPerson.getAge());
        
        Scanner myObj = new Scanner(System.in);
        for (int i = 1; i <=5; ++i) {
        System.out.println("Your age is?");
        String age = myObj.nextLine(); 
        System.out.println("What is the width of your Person?");
        String height = myObj.nextLine(); 
        
       
        System.out.println("What is the name of your Person?");
         
        String name = myObj.nextLine();  
        int age1=0;
        int height1=0;
        boolean numeric = true;

        numeric = age.matches("-?\\d+(\\.\\d+)?");

        if(numeric){
           age1 = Integer.parseInt(age);
           System.out.println("Your age is " + Person3.getAge());
           if (age1>100){System.out.println(age + " your age is too big"); i--;}
        }
        else
        {System.out.println(age + " is not a number");
       
        boolean numeric2 = true;
        numeric2 = height.matches("-?\\d+(\\.\\d+)?");

        if(numeric2){
           height1 = Integer.parseInt(height);
           Person4 = new Person(age1, height1);//create Person with set dimensions
           
        }
        
        else
        {System.out.println(height +" is not a number");}
        //In the above program, instead of using a try-catch block, we use regex to check if string is numeric or not. This is done using String's matches() method.
        }
        String name2=GetName(name);
        
        String myStr1 = "Hello, my name";
        System.out.println("Returned String: " + name2); 
        
        System.out.println("Y or y");
        String yesno = myObj.nextLine(); 
        if (yesno.equals("Y") || yesno.equals("y")){}
        else{i=5;}
        
    } 
        
        Circle circle3;  
      
        
        Scanner myKB = new Scanner(System.in);
        
        System.out.println("What is the height of your Rectangle?");
        String redius = myObj.nextLine(); 
        float pi=3.14f;
       
        float redius1;
        boolean numeric3 = true;

        numeric3 = redius.matches("-?\\d+(\\.\\d+)?");

        if(numeric3){
           redius1 = Float.parseFloat(redius);
           circle3 = new Circle(pi, redius1); //create rectangle with set dimensions
           System.out.println("The area of your Circle is " + circle3.getArea());
           System.out.println("The circumference of your Circle is " + circle3.getCircumference());
           
        }
        else
        {System.out.println(redius + " is not a number");}
        
}
}

