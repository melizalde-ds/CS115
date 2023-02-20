package RealEstate;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PropertyTest {
    @Test
    public void propertyDefaultStreetAddressTest() {
        Property p = new Property();
        String address =  p.getStreetAddress();
        assertEquals(address, "");
    }

    @Test
    public void propertyDefaultZipTest() {
        Property p = new Property();
        String zip =  p.getZip();
        assertEquals(zip, "");
    }

    @Test
    public void getStreetAddressTest(){
        Property p = new Property("North Temple", "84180");
        String address = p.getStreetAddress();
        assertEquals(address, "North Temple");
    }

    @Test
    public void getZipTest(){
        Property p = new Property("North Temple", "84180");
        String zip = p.getZip();
        assertEquals(zip, "84180");
    }

    @Test
    public void setStreetAddressTest() {
        Property p = new Property("North Temple", "84180");
        p.setStreetAddress("South Temple");
        String address = p.getStreetAddress();
        assertEquals(address, "South Temple");
    }

    @Test
    public void setZipTest() {
        Property p = new Property("North Temple", "84180");
        p.setZip("84170");
        String zip = p.getZip();
        assertEquals(zip, "84170");
    }
}
