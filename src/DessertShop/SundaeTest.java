/** 
* File: SundaeTest.java 
* Description: This class test the Class constructors, setters, and getters for the Sundae Class  
* Instructor's Name: Barbara Chamberlin
* 
* @author: Miguel Elizalde
* @since: 02/01/2023
*/
package DessertShop;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

// Tests for the Cookie class
public class SundaeTest {
    // Test Default Constructor
    @Test
    public void sundaeConstructorTest() {
        Sundae s = new Sundae();
        String name = s.getName();
        String topping = s.getToppingName();
        assertEquals(name, "Sundae");
        assertEquals(topping, "Topping");
    }

    // Getters
    // Test getToppingName
    @Test
    public void getToppingNameTest() {
        Sundae s = new Sundae("Chocolate-Vanilla", 3, .5, "Chocolate", .6);
        String tN = s.getToppingName();
        assertEquals(tN, "Chocolate");
    }

    // Test getToppingPrice
    @Test
    public void getToppingPriceTest() {
        Sundae s = new Sundae("Chocolate-Vanilla", 3, .5, "Chocolate", .6);
        double tP = s.getToppingPrice();
        double epsilon = 0.000001d;
        assertEquals(tP, .6, epsilon);
    }

    // Setters
    // Test setToppingName
    @Test
    public void setToppingNameTest() {
        Sundae s = new Sundae("Chocolate-Vanilla", 3, .5, "Chocolate", .6);
        s.setToppingName("Chocolate Explosion");
        String tN = s.getToppingName();
        assertEquals(tN, "Chocolate Explosion");
    }

    // Test setToppingName with a void entry
    @Test
    public void setToppingNameVoidTest() {
        Sundae s = new Sundae("Chocolate-Vanilla", 3, .5, "Chocolate", .6);
        s.setToppingName("");
        String tN = s.getToppingName();
        assertEquals(tN, "Chocolate");
    }

    // Test setToppingPrice
    @Test
    public void setToppingPriceTest() {
        Sundae s = new Sundae("Chocolate-Vanilla", 3, .5, "Chocolate", .6);
        s.setToppingPrice(.603);
        double tP = s.getToppingPrice();
        double epsilon = 0.000001d;
        assertEquals(tP, .603, epsilon);
    }

    // Test setToppingPrice with a Negative
    @Test
    public void setToppingPriceNegativeTest() {
        Sundae s = new Sundae("Chocolate-Vanilla", 3, .5, "Chocolate", .6);
        s.setToppingPrice(-.603);
        double tP = s.getToppingPrice();
        double epsilon = 0.000001d;
        assertEquals(tP, .6, epsilon);
    }

    // Test calculateCost
    @Test
    public void calculateCostTest() {
        Sundae s = new Sundae("Chocolate-Vanilla", 3, .5, "Chocolate", .6);
        double cC = s.calculateCost();
        double epsilon = 0.000001d;
        assertEquals(cC, 2.1, epsilon);
    }

    // Test calculateTax
    @Test
    public void calculateTaxTest() {
        Sundae s = new Sundae("Chocolate-Vanilla", 3, .5, "Chocolate", .6);
        double cCT = s.calculateTax(s.calculateCost());
        double epsilon = 0.000001d;
        assertEquals(cCT, 0.15225, epsilon);
    }
}
