package RealEstate;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HouseTest {
    @Test
    public void houseDefaultTestYardAcres() {
        House h = new House();
        double yardAcres = h.getYardAcres();
        double epsylon = 0.000001d;
        assertEquals(yardAcres, 0, epsylon);
    }

    @Test
    public void getYardAcresTest() {
        House h = new House("North Temple", "84180", 5, 2.5, 900.8, 1.5);
        double yardAcres = h.getYardAcres();
        double epsylon = 0.000001d;
        assertEquals(yardAcres, 1.5, epsylon);
    }

    @Test
    public void setYardAcresTest() {
        House h = new House("North Temple", "84180", 5, 2.5, 900.8, 1.5);
        h.setYardAcres(3);
        double yardAcres = h.getYardAcres();
        double epsylon = 0.000001d;
        assertEquals(yardAcres, 3, epsylon);
    }
}
