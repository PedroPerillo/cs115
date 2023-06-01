package realEstateOffice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResidentialTest {

    @Test
    void getBedCount() {
        Residential r1 = new Residential("Kensington av 123", "84101", 1, 1, 1.5);
        assertEquals(1,r1.getBedCount());
    }

    @Test
    void setBedCount() {
        Residential r1 = new Residential("Kensington av 123", "84101", 1, 1, 1.5);
        r1.setBedCount(2);
        assertEquals(2,r1.getBedCount());
    }

    @Test
    void getBathCount() {
        Residential r1 = new Residential("Kensington av 123", "84101", 1, 1, 1.5);
        assertEquals(1,r1.getBathCount());
    }

    @Test
    void setBathCount() {
        Residential r1 = new Residential("Kensington av 123", "84101", 1, 1, 1.5);
        r1.setBathCount(2);
        assertEquals(2,r1.getBathCount());
    }

    @Test
    void getSize() {
        Residential r1 = new Residential("Kensington av 123", "84101", 1, 1, 1.5);
        assertEquals(1.5,r1.getSize());
    }

    @Test
    void setSize() {
        Residential r1 = new Residential("Kensington av 123", "84101", 1, 1, 1.5);
        r1.setSize(2.5);
        assertEquals(2.5,r1.getSize());
    }
}