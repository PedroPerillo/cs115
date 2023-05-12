/*
 * File: The name of the file such as Person.java
 * Description: A short description of the project.  This does not need to be long.
 * Instructor's Name: Jeffrey Light
 *
 * @author: Pedro Fonseca Perillo
 * @since: May 4, 2023
 */

package week04;

import java.time.LocalDate;

public abstract class DessertItem {
    //Attributes
    private String name;
    private double taxPercent = 7.25;
    //No argument constructor
    public DessertItem(){
        name = "Dessert";
    }

    //Argument constructor
    public DessertItem(String name){
        this.name = name;
    }

    //Setters ang Getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(double taxPercent) {
        this.taxPercent = taxPercent;
    }

    //Tax Methods
    public abstract double calculateCost();
    public double calculateTax(){
        return (taxPercent/100) * calculateCost();
    }


}
