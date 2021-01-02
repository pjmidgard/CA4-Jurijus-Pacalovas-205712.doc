/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personahn;

import java.util.Random;

/**
 *
 * @author Jurijus Pacalovas
 */
public class Person {
    
    // PROPERTIES //
    private int age;  //private means they cannot be accessed outside this class
    private int height;
    
    //CONSTRUTORS
    
    /**
     * create a rectangle using random dimensions
     */
    public Person(){
        
        this.age = pickRandomInt();  //i just picked some numbers to use here
        this.height = pickRandomInt();
        
    }
    
    /**
     * Create a SPECIFIC rectangle
     * @param a - the height of the rectangle
     * @param w - the width of the rectangle
     * @param n - the width of the rectangle
     */
    public Person(int a, int w){
        
        this.age = a;
        this.height = w;
       
    }
    //METHODS
    
    /**
     * 
     * @return the age
     */
    public int getAge(){
        
        return (this.age);
    }
    
    /**
     * 
     * @return the perimeter length of this rectangle
     *  = height * 2 + width * 2
     */
    public int getPerimeter(){
        
        return (this.height);
    }

    /**
     * 
     * @return the height of this rectangle
     */
    public int getHeight(){
        
        return this.height;
    }
    
    /**
     * Set height of this rectangle
     * @param newHeight - the new height
     */
    public void setHeight(int newHeight){
        
        this.height = newHeight;
    }
    
    /**
     * 
     * @return a random int from 0 to 100
     * 
     */
    private int pickRandomInt() {
       
        Random r = new Random();
        
        return (r.nextInt(100));
    } 
}
