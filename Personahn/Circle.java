package Person;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel2014fly
 */
public class Circle {
     // PROPERTIES //
    private float pi;  //private means they cannot be accessed outside this class
    private float radius;

      
    
    //CONSTRUTORS
  
    /**
     * Create a SPECIFIC Circle
     * @param pi - the pi of the circle
     * @param r - the radius of the circle
     */
    public Circle(float pi, float r){
        
        this.pi= pi;
        this.radius = r;
    }
    //METHODS
    
    /**
     * 
     * @return the circle
     * 
     */
    public float getArea(){
		
		//Area pirr
        
        return (this.pi * this.radius * this.radius);
    }
    
    /**
     * 
     * @return the circumference 
     *  circumference 2pir
     */
    public float getCircumference(){
        
        return ( (this.pi * 2) + (this.radius) );
    }

    /**
     * 
     * @return the height of this circle
     */
 
    /**
     * Set height of this rectangle
     * @param newHeight - the new height
     */
    public void setHeight(int newHeight){
        
        this.radius = newHeight;
    }
    
}
