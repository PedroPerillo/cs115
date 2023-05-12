/*
 * File: The name of the file such as Person.java
 * Description: A short description of the project.  This does not need to be long.
 * Instructor's Name: Jeffrey Light
 *
 * @author: Pedro Fonseca Perillo
 * @since: May 4, 2023
 */

package week04;

public class Candy extends DessertItem {
    //Attributes
    private double candyWeight;
    private double pricePerPound;

    //no argument constructor
    public Candy(){
        super("Candy");
        candyWeight = 0;
        pricePerPound = 0;
    }

    //argument constructor
    public Candy( String name, double candyWeight, double pricePerPound){
        super(name);
        this.candyWeight = 0;
        this.setCandyWeight(candyWeight);//this meas the class
        this.pricePerPound = pricePerPound;
    }

    //Setters ang Getters
    public double getCandyWeight() {
        return candyWeight;
    }

    public void setCandyWeight(double candyWeight) {
        if(candyWeight>0){
        this.candyWeight = candyWeight;}
    }

    public double getPricePerPound() {
        return pricePerPound;
    }

    public void setPricePerPound(double pricePerPound) {
        if(pricePerPound>0){
        this.pricePerPound = pricePerPound;}
    }

    //Cost Methods
    @Override
    public double calculateCost() {
        return candyWeight*pricePerPound;
    }
}
