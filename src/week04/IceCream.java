/*
 * File: The name of the file such as Person.java
 * Description: A short description of the project.  This does not need to be long.
 * Instructor's Name: Jeffrey Light
 *
 * @author: Pedro Fonseca Perillo
 * @since: May 4, 2023
 */

package week04;

public class IceCream extends DessertItem  {
    //Attributes
    private int scoopCount;
    private double pricePerScoop;

    //no argument constructor
    public IceCream(){
        super("IceCream");
        scoopCount = 0;
        pricePerScoop = 0;
    }

    //argument constructor
    public IceCream(String name, int scoopCount, double pricePerScoop){
        super(name);
        this.scoopCount = scoopCount;
        this.pricePerScoop = pricePerScoop;
    }

    //Setters ang Getters
    public int getScoopCount() {
        return scoopCount;
    }

    public void setScoopCount(int scoopCount) {
        if(scoopCount>0){
            this.scoopCount = scoopCount;
        }
    }

    public double getPricePerScoop() {
        return pricePerScoop;
    }

    public void setPricePerScoop(double pricePerScoop) {
        if(pricePerScoop>0){
            this.pricePerScoop = pricePerScoop;
        }
    }
    //Cost Methods
    @Override
    public double calculateCost() {
        return scoopCount*pricePerScoop;
    }
}
