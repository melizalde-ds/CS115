package DessertShop;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CookieTest {
    @Test
    public void getCookieQtyTest() {
        Cookie c = new Cookie("Oreo", 48, .67);
        int cQty = c.getCookieQty();
        assertEquals(cQty, 48);
    }

    @Test
    public void getPricePerDozenTest() {
        Cookie c = new Cookie("Oreo", 48, .67);
        double pPD = c.getPricePerDozen();
        double epsilon = 0.000001d;
        assertEquals(pPD, .67, epsilon);
    }

    @Test
    public void setCookieQtyTest() {
        Cookie c = new Cookie("Oreo", 48, .67);
        c.setCookieQty(60);
        int cQty = c.getCookieQty();
        assertEquals(cQty, 60);
    }

    @Test
    public void setPricePerDozenTest() {
        Cookie c = new Cookie("Oreo", 48, .67);
        c.setPricePerDozen(.60);
        double pPD = c.getPricePerDozen();
        double epsilon = 0.000001d;
        assertEquals(pPD, .60, epsilon);
    }
}
