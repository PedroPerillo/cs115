/*
 * File: The name of the file such as Person.java
 * Description: A short description of the project.  This does not need to be long.
 * Instructor's Name: Jeffrey Light
 *
 * @author: Pedro Fonseca Perillo
 * @since: May 4, 2023
 */

package dessertShop;

public class Sundae extends IceCream {
    //Attributes
    private String toppingName;
    private double toppingPrice;

    //no argument constructor
    public Sundae(){
        super("Sundae", 0,0);
        toppingName = "";
        toppingPrice = 0;
        setPackaging("");
    }
    //argument constructor
    public Sundae(String name, int scoopCount, double pricePerScoop, String toppingName, double toppingPrice){
        super(name, scoopCount, pricePerScoop);
        this.toppingName = toppingName;//this meas the class
        this.toppingPrice = toppingPrice;
        setPackaging("Boat");
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
    public double calculateCost() {
        return super.calculateCost()+toppingPrice;

    }
    //toString method
    public String toString(){
        String line1 = String.format("%s",this.getName());
        String line1Packaging = String.format("%s", this.getPackaging());
        String line2 = String.format("%-1s scoops of %s ice cream @ $%.2f /Scoop",getScoopCount(),getName(),getPricePerScoop());
        String line3Pt1 = String.format("%s topping @ $%.2f:",this.getToppingName(),this.getToppingPrice());
        String line3Pt2 =String.format("$%.2f",calculateCost());
        String line3Pt3=String.format("[Tax: $%.2f]",calculateTax());

        String outputVar = String.format("%s (%s)\n\t%s\n\t%-45s%s%17s", line1, line1Packaging, line2, line3Pt1, line3Pt2, line3Pt3);
        return outputVar;
    }
}
