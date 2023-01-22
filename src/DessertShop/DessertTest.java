package DessertShop;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DessertTest {

    @Test
    public void testGetName() {
        DessertItem dI = new DessertItem("Apple Pie");
        String name = dI.getName();
        assertEquals(name, "Apple Pie");
    }

    @Test
    public void testSetName() {
        DessertItem dI = new DessertItem("Apple Pie");
        dI.setName("Chocolate Cake");
        String name = dI.getName();
        assertEquals(name, "Chocolate Cake");
    }

    @Test
    public void testGetCandyWeight() {
        Candy c = new Candy("Apple Candy", 5.5, 2);
        double weight = c.getCandyWeight();
        double epsilon = 0.000001d;
        assertEquals(weight, 5.5, epsilon);
    }

    @Test
    public void testGetPricePerPound() {
        Candy c = new Candy("Apple Candy", 5.5, 2);
        double weight = c.getPricePerPound();
        double epsilon = 0.000001d;
        assertEquals(weight, 2, epsilon);
    }

    @Test
    public void testSetCandyWeight() {
        Candy c = new Candy("Apple Candy", 5.5, 2);
        c.setCandyWeight(7);
        double weight = c.getCandyWeight();
        double epsilon = 0.000001d;
        assertEquals(weight, 7, epsilon);
    }

    @Test
    public void testSetPricePerPound() {
        Candy c = new Candy("Apple Candy", 5.5, 2);
        c.setPricePerPound(8);
        double weight = c.getPricePerPound();
        double epsilon = 0.000001d;
        assertEquals(weight, 8, epsilon);
    }

    @Test
    public void testGetCookieQty() {
        Cookie c = new Cookie("Oreo", 48, 1.25);
        int qty = c.getCookieQty();
        assertEquals(qty, 48);
    }

    @Test
    public void testGetPricePerDozen() {
        Cookie c = new Cookie("Oreo", 48, 1.25);
        double price = c.getPricePerDozen();
        double epsilon = 0.000001d;
        assertEquals(price, 1.25, epsilon);  
    }

    @Test
    public void testSetCookieQty() {
        Cookie c = new Cookie("Oreo", 48, 1.25);
        c.setCookieQty(60);
        int qty = c.getCookieQty();
        assertEquals(qty, 60);
    }

    @Test
    public void testSetCookiePricePerDozen() {
        Cookie c = new Cookie("Oreo", 48, 1.25);
        c.setPricePerDozen(1.5);
        double price = c.getPricePerDozen();
        double epsilon = 0.000001d;
        assertEquals(price, 1.5, epsilon);  
    }

    @Test
    public void testGetScoopCount() {
        IceCream iC = new IceCream("Nemo", 3, .75);
        int scoop = iC.getScoopCount();
        assertEquals(scoop, 3);
    }

    @Test
    public void testGetPricePerScoop() {
        IceCream iC = new IceCream("Nemo", 3, .75);
        double price = iC.getPricePerScoop();
        double epsilon = 0.000001d;
        assertEquals(price, .75, epsilon);
    }

    @Test
    public void testSetScoopCount() {
        IceCream iC = new IceCream("Nemo", 3, .75);
        iC.setScoopCount(5);
        int scoop = iC.getScoopCount();
        assertEquals(scoop, 5);
    }

    @Test
    public void testSetCookiePricePerScoop() {
        IceCream iC = new IceCream("Nemo", 3, .75);
        iC.setPricePerScoop(.87);
        double price = iC.getPricePerScoop();
        double epsilon = 0.000001d;
        assertEquals(price, .87, epsilon);
    }

    @Test
    public void testGetToppingName() {
        Sundae s = new Sundae("McFlurry", 1, .75, "Oreo Crumbls", 3);
        String topping = s.getToppingName();
        assertEquals(topping, "Oreo Crumbls");
    }

    @Test
    public void testGetToppingPrice() {
        Sundae s = new Sundae("McFlurry", 1, .75, "Oreo Crumbls", 3);
        double price= s.getToppingPrice();
        double epsilon = 0.000001d;
        assertEquals(price, 3, epsilon);
    }

    @Test
    public void testSetToppingName() {
        Sundae s = new Sundae("McFlurry", 1, .75, "Oreo Crumbls", 3);
        s.setToppingName("M&M");
        String topping = s.getToppingName();
        assertEquals(topping, "M&M");
    }

    @Test
    public void testSetToppingPrice() {
        Sundae s = new Sundae("McFlurry", 1, .75, "Oreo Crumbls", 3);
        s.setToppingPrice(2.5);
        double price= s.getToppingPrice();
        double epsilon = 0.000001d;
        assertEquals(price, 2.5, epsilon);
    }
}
