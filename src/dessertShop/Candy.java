/*
 * File: The name of the file such as Person.java
 * Description: A short description of the project.  This does not need to be long.
 * Instructor's Name: Jeffrey Light
 *
 * @author: Pedro Fonseca Perillo
 * @since: May 4, 2023
 */

package dessertShop;

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

    //toString method
    public String toString(){
        String line1 = String.format("%s",this.getName());
        String line2Pt1 = String.format("%s lbs. @ $%-1.2f/lb.:",this.getCandyWeight(),this.getPricePerPound());
        String line2Pt2 ="pt2";
        String line2Pt3="pt3";

       /* String line2_1 ="XX.XX lbs. @ $XX.XX/lb.:"
        String line2_2 += "$XXX.XX";
        String line3 = "[Tax: $XXX]";

       String  finalOutput = null;

        finalOutput += "------------------------Receipt-------------------";
        for (DessertItem item : this.) {

        }
        */
        String outputVar = String.format("%s\n\t%-45s%s%17s", line1, line2Pt1, line2Pt2, line2Pt3);
        return outputVar;
    }
}
