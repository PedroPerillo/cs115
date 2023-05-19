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

class CookieTest {

    @Test
    void getCookieQty() {
        Cookie cookie = new Cookie();
        assertEquals(10, cookie.getCookieQty());
    }

    @Test
    void setCookieQty() {
        Cookie cookieSet = new Cookie("Chocolate Chip",10, 5.00);
        cookieSet.setCookieQty(15);
        assertEquals(15, cookieSet.getCookieQty());
    }

    @Test
    void getPricePerDozen() {
        Cookie cookie = new Cookie("Chocolate Chip",10, 5.00);
        assertEquals(5.00, cookie.getPricePerDozen());
    }

    @Test
    void setPricePerDozen() {
        Cookie cookieSet = new Cookie("Chocolate Chip",10, 5.00);
        cookieSet.setPricePerDozen(10.00);
        assertEquals(10.00, cookieSet.getPricePerDozen());
    }

    @Test
    void setCookieQtyNeg() {
        Cookie cookieSet = new Cookie("Chocolate Chip",10, 5.00);
        cookieSet.setCookieQty(-15);
        assertEquals(10, cookieSet.getCookieQty());
    }

    @Test
    void setPricePerDozenNeg() {
        Cookie cookieSet = new Cookie("Chocolate Chip",10, 5.00);
        cookieSet.setPricePerDozen(-10.00);
        assertEquals(5.00, cookieSet.getPricePerDozen());
    }

    @Test
    void calculateCost() {
        Cookie cookieSet = new Cookie("Chocolate Chip",10, 5.00);
        assertEquals((double) 50 /12,cookieSet.calculateCost());
    }

    @Test
    void calculateTax() {
        Cookie cookieSet = new Cookie("Chocolate Chip",10, 5.00);
        assertEquals(((double) 50 /12)*(7.25/100),cookieSet.calculateTax());
    }
}
