package RealEstate;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ResidentialTest {
    @Test
    public void residentialDefaultTestBed() {
        Residential r = new Residential();
        double bed = r.getBedCount();
        double epsylon = 0.000001d;
        assertEquals(bed, 0, epsylon);
    }

    @Test
    public void residentialDefaultTestBath() {
        Residential r = new Residential();
        double bath = r.getBathCount();
        double epsylon = 0.000001d;
        assertEquals(bath, 0, epsylon);
    }

    @Test
    public void residentialDefaultTestSQFootage() {
        Residential r = new Residential();
        double sqFt = r.getSqFootage();
        double epsylon = 0.000001d;
        assertEquals(sqFt, 0, epsylon);
    }

    @Test
    public void getBedCountTest() {
        Residential r = new Residential("North Temple", "84180", 3, 1.5, 750);
        double bed = r.getBedCount();
        double epsylon = 0.000001d;
        assertEquals(bed, 3, epsylon);
    }

    @Test
    public void getBathCountTest() {
        Residential r = new Residential("North Temple", "84180", 3, 1.5, 750);
        double bath = r.getBathCount();
        double epsylon = 0.000001d;
        assertEquals(bath, 1.5, epsylon);
    }

    @Test
    public void getSqFootageTest() {
        Residential r = new Residential("North Temple", "84180", 3, 1.5, 750);
        double sqFt = r.getSqFootage();
        double epsylon = 0.000001d;
        assertEquals(sqFt, 750, epsylon);
    }

    @Test
    public void setBedCountTest() {
        Residential r = new Residential("North Temple", "84180", 3, 1.5, 750);
        r.setBedCount(4);
        double bed = r.getBedCount();
        double epsylon = 0.000001d;
        assertEquals(bed, 4, epsylon);
    }

    @Test
    public void setBathCountTest() {
        Residential r = new Residential("North Temple", "84180", 3, 1.5, 750);
        r.setBathCount(2);
        double bath = r.getBathCount();
        double epsylon = 0.000001d;
        assertEquals(bath, 2, epsylon);
    }

    @Test
    public void setSqFootageTest() {
        Residential r = new Residential("North Temple", "84180", 3, 1.5, 750);
        r.setSqFootage(795.7);
        double sqFt = r.getSqFootage();
        double epsylon = 0.000001d;
        assertEquals(sqFt, 795.7, epsylon);
    }
}
