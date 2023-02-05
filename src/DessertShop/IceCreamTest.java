/** 
* File: IceCreamTest.java 
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
public class IceCreamTest {
    // Test Default Constructor
    @Test
    public void iceCreamConstructorTest() {
        IceCream iC = new IceCream();
        String name = iC.getName();
        assertEquals(name, "IceCream");
    }

    // Getters
    // Test getScoopCount
    @Test
    public void getScoopCountTetst() {
        IceCream iC = new IceCream("Chocolate-Mint", 3, .8);
        int sC = iC.getScoopCount();
        assertEquals(sC, 3);
    }

    // Test getPricePerPound
    @Test
    public void getPricePerScoopTest() {
        IceCream iC = new IceCream("Chocolate-Mint", 3, .8);
        double pPS = iC.getPricePerScoop();
        double epsilon = 0.000001d;
        assertEquals(pPS, .8, epsilon);
    }

    // Setters
    // Test setScoopCountTest
    @Test
    public void setScoopCountTest() {
        IceCream iC = new IceCream("Chocolate-Mint", 3, .8);
        iC.setScoopCount(4);
        int sC = iC.getScoopCount();
        assertEquals(sC, 4);
    }

    // Test setScoopCount with a Negative
    @Test
    public void setScoopCountNegativeTest() {
        IceCream iC = new IceCream("Chocolate-Mint", 3, .8);
        iC.setScoopCount(-4);
        int sC = iC.getScoopCount();
        assertEquals(sC, 3);
    }

    // Test setPricePerScoop
    @Test
    public void setPricePerScoopTest() {
        IceCream iC = new IceCream("Chocolate-Mint", 3, .8);
        iC.setPricePerScoop(.9);
        double pPS = iC.getPricePerScoop();
        double epsilon = 0.000001d;
        assertEquals(pPS, .9, epsilon);
    }

    // Test setPricePerScoop with a Negative
    @Test
    public void setPricePerScoopNegativeTest() {
        IceCream iC = new IceCream("Chocolate-Mint", 3, .8);
        iC.setPricePerScoop(-.9);
        double pPS = iC.getPricePerScoop();
        double epsilon = 0.000001d;
        assertEquals(pPS, .8, epsilon);
    }

    // Test calculateCost
    @Test
    public void calculateCostTest() {
        IceCream iC = new IceCream("Chocolate-Mint", 3, .8);
        double cC = iC.calculateCost();
        double epsilon = 0.000001d;
        assertEquals(cC, 2.4, epsilon);
    }

    // Test calculateTax
    @Test
    public void calculateTaxTest() {
        IceCream iC = new IceCream("Chocolate-Mint", 3, .8);
        double cCT = iC.calculateTax(iC.calculateCost());
        double epsilon = 0.000001d;
        assertEquals(cCT, 0.174, epsilon);
    }
}
