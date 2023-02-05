/** 
* File: CandyTest.java 
* Description: This class test the Class constructors, setters, and getters for the Candy Class  
* Instructor's Name: Barbara Chamberlin
* 
* @author: Miguel Elizalde
* @since: 2/3/2023
*/
package DessertShop;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

// Tests for the Candy class
public class CandyTest {
    // Test Default Constructor
    @Test
    public void candyCunstructorTest() {
        Candy c = new Candy();
        String name = c.getName();
        assertEquals(name, "Candy");
    }

    // Getters
    // Test getCandyWeight
    @Test
    public void getCandyWeightTest() {
        Candy c = new Candy("Skittles", .75, .1);
        double cW = c.getCandyWeight();
        double epsilon = 0.0000001d;
        assertEquals(cW, .75, epsilon);
    }

    // Test getPricePerPound
    @Test
    public void getPricePerPoundTest() {
        Candy c = new Candy("Skittles", .75, .1);
        double pPP = c.getPricePerPound();
        double epsilon = 0.0000001d;
        assertEquals(pPP, .1, epsilon);
    }

    // Setters
    // Test setCandyWeight
    @Test
    public void setCandyWeightTest() {
        Candy c = new Candy("Skittles", .75, .1);
        c.setCandyWeight(.86);
        double cW = c.getCandyWeight();
        double epsilon = 0.0000001d;
        assertEquals(cW, .86, epsilon);
    }

    // Test setCandyWeight with a negative number
    @Test
    public void setCandyWeightNegativeTest() {
        Candy c = new Candy("Skittles", .75, .1);
        c.setCandyWeight(-1);
        double cW = c.getCandyWeight();
        double epsilon = 0.0000001d;
        assertEquals(cW, .75, epsilon);
    }

    // Test setPricePerPound
    @Test
    public void setPricePerPoundTest() {
        Candy c = new Candy("Skittles", .75, .1);
        c.setPricePerPound(.15);
        double pPP = c.getPricePerPound();
        double epsilon = 0.0000001d;
        assertEquals(pPP, .15, epsilon);
    }

    // Test setPricePerPound with a negative
    @Test
    public void setPricePerPoundNegativeTest() {
        Candy c = new Candy("Skittles", .75, .1);
        c.setPricePerPound(-15);
        double pPP = c.getPricePerPound();
        double epsilon = 0.0000001d;
        assertEquals(pPP, .1, epsilon);
    }

    // Test calculateCost
    @Test
    public void calculateCostTest() {
        Candy c = new Candy("Skittles", .75, .1);
        double cC = c.calculateCost();
        double epsilon = 0.0000001d;
        assertEquals(cC, .075, epsilon);
    }

    // Test calculateTax
    @Test
    public void calculateTaxTest() {
        Candy c = new Candy("Skittles", .75, .1);
        double cCT = c.calculateTax(c.calculateCost());
        double epsilon = 0.0000001d;
        assertEquals(cCT, .0054375, epsilon);
    }
}
