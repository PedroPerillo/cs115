/*
 * File: The name of the file such as Person.java
 * Description: A short description of the project.  This does not need to be long.
 * Instructor's Name: Jeffrey Light
 *
 * @author: Pedro Fonseca Perillo
 * @since: May 4, 2023
 */

package dessertShop;

public class Cookie extends DessertItem {
    //Attributes
    private int cookieQty;
    private double pricePerDozen;

    //no argument constructor
    public Cookie(){
        super("Cookie");
        cookieQty = 0;
        pricePerDozen = 0;
    }

    //argument constructor
    public Cookie( String name, int cookieQty, double pricePerDozen){
        super(name);
        this.cookieQty = cookieQty;
        this.pricePerDozen = pricePerDozen;
    }

    //Setters ang Getters
    public int getCookieQty() {
        return cookieQty;
    }

    public void setCookieQty(int cookieQty) {
        if(cookieQty>0){
            this.cookieQty = cookieQty;
        }
    }

    public double getPricePerDozen() {
        return pricePerDozen;
    }

    public void setPricePerDozen(double pricePerDozen) {
        if(pricePerDozen>0) {
            this.pricePerDozen = pricePerDozen;
        }
    }
    //Cost Methods
    @Override
    public double calculateCost() {
        return (cookieQty*pricePerDozen)/12;
    }

    //toString method
    public String toString(){
        String line1 = String.format("%s",this.getName());
        String line2Pt1 = String.format("%s cookies @ $%-1.2f/Dozen:",this.getCookieQty(),this.getPricePerDozen());
        String line2Pt2 =String.format("$%.2f",calculateCost());
        String line2Pt3=String.format("[Tax: $%.2f]",calculateTax());

        String outputVar = String.format("%s\n\t%-45s%s%17s", line1, line2Pt1, line2Pt2, line2Pt3);
        return outputVar;
    }
}
