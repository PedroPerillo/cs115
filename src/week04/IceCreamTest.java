/*
 * File: The name of the file such as Person.java
 * Description: A short description of the project.  This does not need to be long.
 * Instructor's Name: Jeffrey Light
 *
 * @author: Pedro Fonseca Perillo
 * @since: May 4, 2023
 */
package week04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IceCreamTest {

    @Test
    void getScoopCount() {
        IceCream iceCream = new IceCream("Mint Chocolate Chip",2, 2.00);
        assertEquals(2, iceCream.getScoopCount());
    }

    @Test
    void setScoopCount() {
        IceCream iceCreamSet = new IceCream("Mint Chocolate Chip",2, 2.00);
        iceCreamSet.setScoopCount(3);
        assertEquals(3, iceCreamSet.getScoopCount());
    }

    @Test
    void getPricePerScoop() {
        IceCream iceCream = new IceCream("Mint Chocolate Chip",2, 2.00);
        assertEquals(2.00, iceCream.getScoopCount());
    }

    @Test
    void setPricePerScoop() {
        IceCream iceCreamSet = new IceCream("Mint Chocolate Chip",2, 2.00);
        iceCreamSet.setPricePerScoop(3.00);
        assertEquals(3.00, iceCreamSet.getPricePerScoop());
    }

    @Test
    void setScoopCountNeg() {
        IceCream iceCreamSet = new IceCream("Mint Chocolate Chip",2, 2.00);
        iceCreamSet.setScoopCount(-3);
        assertEquals(2, iceCreamSet.getScoopCount());
    }

    @Test
    void setPricePerScoopNeg() {
        IceCream iceCreamSet = new IceCream("Mint Chocolate Chip",2, 2.00);
        iceCreamSet.setPricePerScoop(-3.00);
        assertEquals(2.00, iceCreamSet.getPricePerScoop());
    }

}