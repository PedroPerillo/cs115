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
import week02.Person;

import static org.junit.jupiter.api.Assertions.*;

class DessertItemTest {

    @Test
    void Constructor() {
        DessertItem dessertItem = new DessertItem();
        assertEquals("Dessert",dessertItem.getName());
    }

    @Test
    void GetName() {
        DessertItem dessertItem = new DessertItem("Ice Cream");
        assertEquals("Ice Cream",dessertItem.getName());
    }

    @Test
    void SetName() {
        DessertItem dessertItemSet = new DessertItem("Chocolate");
        dessertItemSet.setName("Pudding");
        assertEquals("Pudding", dessertItemSet.getName());
    }

}