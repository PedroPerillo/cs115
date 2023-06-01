package realEstateOffice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {

    @Test
    void getYardAcres() {
        House h1 = new House("Kensington av 123","84101",1,1,1.5,10);
        assertEquals(10,h1.getYardAcres());
    }

    @Test
    void setYardAcres() {
        House h1 = new House("Kensington av 123","84101",1,1,1.5,10);
        h1.setYardAcres(20);
        assertEquals(20,h1.getYardAcres());
    }
}