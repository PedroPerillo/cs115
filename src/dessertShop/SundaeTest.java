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

class SundaeTest {

    @Test
    void getToppingName() {
        Sundae sundae = new Sundae("Sprinkles",2,1.50,"Sprinkle Sundae",2.5);
        assertEquals("Sprinkle Sundae",sundae.getToppingName());
    }

    @Test
    void setToppingName() {
        Sundae sundaeSet = new Sundae("Sprinkles",2,1.50,"Sprinkle Sundae",2.5);
        sundaeSet.setToppingName("Caramel");
        assertEquals("Caramel",sundaeSet.getToppingName());
    }

    @Test
    void getToppingPrice() {
        Sundae sundae = new Sundae("Sprinkles",2,1.50,"Sprinkle Sundae",2.5);
        assertEquals(2.5,sundae.getToppingPrice());
    }

    @Test
    void setToppingPrice() {
        Sundae sundaeSet = new Sundae("Sprinkles",2,1.50,"Sprinkle Sundae",2.5);
        sundaeSet.setToppingPrice(2.00);
        assertEquals(2.00,sundaeSet.getToppingPrice());
    }

    @Test
    void setToppingPriceNeg() {
        Sundae sundaeSet = new Sundae("Sprinkles",2,1.50,"Sprinkle Sundae",2.5);
        sundaeSet.setToppingPrice(-2.00);
        assertEquals(2.5,sundaeSet.getToppingPrice());
    }

    @Test
    void calculateCost() {
        Sundae sundaeSet = new Sundae("Sprinkles",2,1.50,"Sprinkle Sundae",2.5);
        assertEquals(5.5,sundaeSet.calculateCost());
    }

    @Test
    void calculateTax() {
        Sundae sundaeSet = new Sundae("Sprinkles",2,1.50,"Sprinkle Sundae",2.5);
        assertEquals(5.5*(7.25/100),sundaeSet.calculateTax());
    }
}