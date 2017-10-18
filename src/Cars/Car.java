/*
Class Name: Car 
Class Author: Mary Waite
******************************************************
Purpose of the class: holds Car objects & performs calculations

******************************************************
Date: 20 September 2017
******************************************************
List of changes with dates. 
******************************************************
*/
package Cars;
import java.awt.*;

/**
 *
 * @author mw047
 */
public class Car 
{
    private String make;
    private String model;
    private Color color;
    private int speed = 0;
    
    public void Car()
    {
        make = null;
        model = null;
        color = null;
    }
    
    //car(make:string, model:string, color:color)
    public void Car(String m, String mod, Color c)
    {
        make = m;
        model = mod;
        color = c;
    }
    
    
    //+ accelerate()
    public void accelerate() {
        this.speed +=5;
    }

    //+ brake() 
    public void brake() {
        if(speed>=5)
            this.speed -=5;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(Color color) {
        this.color = color;
    }
        
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
    
    /*******************************************************
    * Method Name: getColor
    * Method Author: Mary Waite
    ****************************************************** 
    * Purpose of the Method: returns name of car color
    * Method Inputs: none
    * Return value: none
    ******************************************************
    * List of changes with dates:
    ******************************************************
    * Date: 20 September 2017
    * @return c */
    public String getColor() {
        String c;
        if(color.equals(Color.blue))
            c = "Blue";
        else if(color.equals(Color.gray))
            c = "Gray";
        else if(color.equals(Color.red))
            c = "Red";
        else if(color.equals(Color.green))
            c = "Green";
        else if(color.equals(Color.white))
            c = "White";
        else
            c = "Black";
        
        return c;
    }
    
    public int getSpeed() {
        return speed;
    }
}