/** 
* File: CookieTest.java 
* Description: This class test the Class constructors, setters, and getters for the Cookie Class  
* Instructor's Name: Barbara Chamberlin
* 
* @author: Miguel Elizalde
* @since: 02/01/2023
*/
package DessertShop;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

// Tests for the Cookie class
public class CookieTest {
    // Test Default Constructor
    @Test
    public void cookieConstructorTest() {
        Cookie c = new Cookie();
        String name = c.getName();
        assertEquals(name, "Cookie");
    }

    // Getters
    // Test getCookieQty
    @Test
    public void getCookieQtyTest() {
        Cookie c = new Cookie("Oreo", 48, .67);
        int cQty = c.getCookieQty();
        assertEquals(cQty, 48);
    }

    // Test getPricePerDozen
    @Test
    public void getPricePerDozenTest() {
        Cookie c = new Cookie("Oreo", 48, .67);
        double pPD = c.getPricePerDozen();
        double epsilon = 0.000001d;
        assertEquals(pPD, .67, epsilon);
    }

    // Setters
    // Test setCookieQty
    @Test
    public void setCookieQtyTest() {
        Cookie c = new Cookie("Oreo", 48, .67);
        c.setCookieQty(60);
        int cQty = c.getCookieQty();
        assertEquals(cQty, 60);
    }

    // Test setCookieQty with a negative
    @Test
    public void setCookieQtyNegativeTest() {
        Cookie c = new Cookie("Oreo", 48, .67);
        c.setCookieQty(-60);
        int cQty = c.getCookieQty();
        assertEquals(cQty, 48);
    }

    // Test setPricePerDozen
    @Test
    public void setPricePerDozenTest() {
        Cookie c = new Cookie("Oreo", 48, .67);
        c.setPricePerDozen(.60);
        double pPD = c.getPricePerDozen();
        double epsilon = 0.000001d;
        assertEquals(pPD, .60, epsilon);
    }

    // Test setPricePerDozen with a Negative
    @Test
    public void setPricePerDozenNegativeTest() {
        Cookie c = new Cookie("Oreo", 48, .67);
        c.setPricePerDozen(-.60);
        double pPD = c.getPricePerDozen();
        double epsilon = 0.000001d;
        assertEquals(pPD, .67, epsilon);
    }
}
