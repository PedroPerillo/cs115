/*
 * File: The name of the file such as Person.java
 * Description: A short description of the project.  This does not need to be long.
 * Instructor's Name: Jeffrey Light
 *
 * @author: Pedro Fonseca Perillo
 * @since: May 4, 2023
 */

package week04;

public class Sundae extends IceCream {
    //Attributes
    private String toppingName;
    private double toppingPrice;

    //no argument constructor
    public Sundae(){
        super(0,0,"Sundae");
        toppingName = "";
        toppingPrice = 0;
    }
    //argument constructor
    public Sundae(String toppingName, double toppingPrice, int scoopCount, double pricePerScoop, String name){
        super(scoopCount, pricePerScoop, name);
        this.toppingName = toppingName;//this meas the class
        this.toppingPrice = toppingPrice;
    }

    //Setters ang Getters
    public String getToppingName() {
        return toppingName;
    }

    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }

    public double getToppingPrice() {
        return toppingPrice;
    }

    public void setToppingPrice(double toppingPrice) {
        if(toppingPrice>0){
            this.toppingPrice = toppingPrice;
        }
    }
}
