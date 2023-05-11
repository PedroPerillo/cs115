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

class SundaeTest {

    @Test
    void getToppingName() {
        Sundae sundae = new Sundae("Sprinkles",2,1.50,"Sprinkle Sundae",2.5);
        assertEquals("Sprinkles",sundae.getToppingName());
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
        assertEquals(1.50,sundae.getToppingPrice());
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
        assertEquals(1.50,sundaeSet.getToppingPrice());
    }

}