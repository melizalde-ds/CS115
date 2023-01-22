package DessertShop;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SundaeTest {
    @Test
    public void getToppingNameTest() {
        Sundae s = new Sundae("Chocolate-Vanilla", 3, .5, "Chocolate", .6);
        String tN = s.getToppingName();
        assertEquals(tN, "Chocolate");
    }

    @Test
    public void getToppingPriceTest() {
        Sundae s = new Sundae("Chocolate-Vanilla", 3, .5, "Chocolate", .6);
        double tP = s.getToppingPrice();
        double epsilon = 0.000001d;
        assertEquals(tP, .6, epsilon);
    }

    @Test
    public void setToppingNameTest() {
        Sundae s = new Sundae("Chocolate-Vanilla", 3, .5, "Chocolate", .6);
        s.setToppingName("Chocolate Explosion");
        String tN = s.getToppingName();
        assertEquals(tN, "Chocolate Explosion");
    }

    @Test
    public void setToppingPriceTest() {
        Sundae s = new Sundae("Chocolate-Vanilla", 3, .5, "Chocolate", .6);
        s.setToppingPrice(.603);
        double tP = s.getToppingPrice();
        double epsilon = 0.000001d;
        assertEquals(tP, .603, epsilon);
    }
}
