package dessertShop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DessertItemTest {

    @Test
    void getName() {
        DessertItem iceCream = new IceCream ("Ice Cream",3,0.79);
        assertEquals("Ice Cream",iceCream.getName());
    }

    @Test
    void setName() {
        DessertItem iceCream = new IceCream ("Ice Cream",3,0.79);
        iceCream.setName("Pistachio");
        assertEquals("Pistachio",iceCream.getName());
    }

    @Test
    void getTaxPercent() {
        DessertItem iceCream = new IceCream ("Ice Cream",3,0.79);
        double tax = iceCream.getTaxPercent();
        assertEquals(7.25,tax);
    }

    @Test
    void setTaxPercent() {
        DessertItem iceCream = new IceCream ("Ice Cream",3,0.79);
        iceCream.setTaxPercent(8);
        assertEquals(8,iceCream.getTaxPercent());
    }

}