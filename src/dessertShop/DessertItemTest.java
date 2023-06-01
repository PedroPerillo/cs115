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
        assertEquals(7.25,iceCream.getTaxPercent());
    }

    @Test
    void setTaxPercent() {
        DessertItem iceCream = new IceCream ("Ice Cream",3,0.79);
        iceCream.setTaxPercent(8);
        assertEquals(8,iceCream.getTaxPercent());
    }

    @Test
    void getPackaging(){
        DessertItem iceCream = new IceCream ("Ice Cream",3,0.79);
        assertEquals("Bowl",iceCream.getPackaging());
    }
    @Test
    void setPackaging(){
        DessertItem iceCream = new IceCream ("Ice Cream",3,0.79);
        iceCream.setPackaging("Pint");
        assertEquals("Pint",iceCream.getPackaging());
    }

}