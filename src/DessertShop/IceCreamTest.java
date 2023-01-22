package DessertShop;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IceCreamTest {
    @Test
    public void getScoopCountTetst() {
        IceCream iC = new IceCream("Chocolate-Mint", 3, .8);
        int sC = iC.getScoopCount();
        assertEquals(sC, 3);
    }

    @Test
    public void getPricePerScoopTest() {
        IceCream iC = new IceCream("Chocolate-Mint", 3, .8);
        double pPS = iC.getPricePerScoop();
        double epsilon = 0.000001d;
        assertEquals(pPS, .8, epsilon);
    }

    @Test
    public void setScoopCountTest() {
        IceCream iC = new IceCream("Chocolate-Mint", 3, .8);
        iC.setScoopCount(4);
        int sC = iC.getScoopCount();
        assertEquals(sC, 4);
    }

    @Test
    public void setPricePerScoopTest() {
        IceCream iC = new IceCream("Chocolate-Mint", 3, .8);
        iC.setPricePerScoop(.9);
        double pPS = iC.getPricePerScoop();
        double epsilon = 0.000001d;
        assertEquals(pPS, .9, epsilon);
    }
}
