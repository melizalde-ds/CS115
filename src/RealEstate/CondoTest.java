package RealEstate;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CondoTest {
    @Test
    public void condoDefaultFloorLvl() {
        Condo c = new Condo();
        int floorLvl = c.getFloorLvl();
        assertEquals(floorLvl, 0);
    }

    @Test
    public void getFloorLvlTest() {
        Condo c = new Condo("North Temple", "84180", 5, 2.5, 800, 10);
        int floorLvl = c.getFloorLvl();
        assertEquals(floorLvl, 10);
    }

    @Test
    public void setFloorLvlTest() {
        Condo c = new Condo("North Temple", "84180", 5, 2.5, 800, 10);
        c.setFloorLvl(15);
        int floorLvl = c.getFloorLvl();
        assertEquals(floorLvl, 15);
    }
}
