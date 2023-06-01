package realEstateOffice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyTest {

    @Test
    void getStreetAddress() {
        Property a1 = new Property("Kensington av 123","84101");
        assertEquals("Kensington av 123",a1.getStreetAddress());
    }

    @Test
    void setStreetAddress() {
        Property a1 = new Property("Kensington av 123","84101");
        a1.setStreetAddress("South Kensington Station");
        assertEquals("South Kensington Station",a1.getStreetAddress());
    }

    @Test
    void getZip() {
        Property a1 = new Property("Kensington av 123","84101");
        assertEquals("84101",a1.getZip());
    }

    @Test
    void setZip() {
        Property a1 = new Property("Kensington av 123","84101");
        a1.setZip("84009");
        assertEquals("84009",a1.getZip());
    }
}