package realEstateOffice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CondoTest {

    @Test
    void getFloorLevel() {
        Condo c1 = new Condo("Kensington av 123","84101",1,1,1.5,3);
        assertEquals(3,c1.getFloorLevel());
    }

    @Test
    void setFloorLevel() {
        Condo c1 = new Condo("Kensington av 123","84101",1,1,1.5,3);
        c1.setFloorLevel(5);
        assertEquals(5,c1.getFloorLevel());
    }
}