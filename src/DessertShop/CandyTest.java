package DessertShop;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CandyTest {
    @Test
    public void getCandyWeightTest() {
        Candy c = new Candy("Skittles", .75, .1);
        double cW = c.getCandyWeight();
        double epsilon = 0.0000001d;
        assertEquals(cW, .75, epsilon);
    }

    @Test
    public void getPricePerPoundTest() {
        Candy c = new Candy("Skittles", .75, .1);
        double pPP = c.getPricePerPound();
        double epsilon = 0.0000001d;
        assertEquals(pPP, .1, epsilon);
    }

    @Test
    public void setCandyWeightTest() {
        Candy c = new Candy("Skittles", .75, .1);
        c.setCandyWeight(.86);
        double cW = c.getCandyWeight();
        double epsilon = 0.0000001d;
        assertEquals(cW, .86, epsilon);
    }

    @Test
    public void setPricePerPoundTest() {
        Candy c = new Candy("Skittles", .75, .1);
        c.setPricePerPound(.15);
        double pPP = c.getPricePerPound();
        double epsilon = 0.0000001d;
        assertEquals(pPP, .15, epsilon);
    }
}
