/*
 * File: The name of the file such as Person.java
 * Description: A short description of the project.  This does not need to be long.
 * Instructor's Name: Jeffrey Light
 *
 * @author: Pedro Fonseca Perillo
 * @since: May 4, 2023
 */
package dessertShop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandyTest {

    @Test
    void getCandyWeight() {
        Candy candy = new Candy("Chocolate",10,5.00);
        assertEquals(10,candy.getCandyWeight());
    }

    @Test
    void setCandyWeight() {
        Candy candySet = new Candy("Chocolate",10,5.00);
        candySet.setCandyWeight(15);
        assertEquals(15,candySet.getCandyWeight());

    }

    @Test
    void getPricePerPound() {
        Candy candy = new Candy("Chocolate",10,5.00);
        assertEquals(5.00,candy.getPricePerPound());
    }

    @Test
    void setPricePerPound() {
        Candy candySet = new Candy("Chocolate",10,5.00);
        candySet.setPricePerPound(10.00);
        assertEquals(10.00,candySet.getPricePerPound());
    }

   @Test
   void setCandyWeightNeg() {
        Candy candySet = new Candy("Chocolate",10,5.00);
        candySet.setCandyWeight(-10);
        assertEquals(10,candySet.getCandyWeight());
    }
    @Test
    void setPricePerPoundNeg() {
        Candy candySet = new Candy("Chocolate",10,5.00);
        candySet.setPricePerPound(-10.00);
        assertEquals(5.00,candySet.getPricePerPound());
    }

    @Test
    void calculateCost() {
        Candy candySet = new Candy("Chocolate",10,5.00);
        assertEquals(50,candySet.calculateCost());
    }

    @Test
    void calculateTax() {
        Candy candySet = new Candy("Chocolate",10,5.00);
        assertEquals(50*(7.25/100),candySet.calculateTax());
    }
}