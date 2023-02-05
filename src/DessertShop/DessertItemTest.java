/** 
* File: DessertItemTest.java 
* Description: This class test the Class constructors, setters, and getters from DessertItem Class  
* Instructor's Name: Barbara Chamberlin
* 
* @author: Miguel Elizalde
* @since: 2/3/2023
*/

package DessertShop;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

// Tests for the Person class
public class DessertItemTest {
    // Test Constructor
    @Test
    public void constructorTest() {
        Candy c = new Candy();
        String name = c.getName();
        assertEquals(name, "Candy");
    }

    // Getters Test
    // Test getName
    @Test
    public void getNameTest() {
        DessertItem dI = new Candy("Candy Test", 5.5, 4.5);
        String name = dI.getName();
        assertEquals(name, "Candy Test");
    }

    // Test getName
    @Test
    public void getTaxPercentTest() {
        DessertItem dI = new Candy("Candy Test", 5.5, 4.5);
        double tax = dI.getTaxPercent();
        double epsylon = 0.000001d;
        assertEquals(tax, 7.25, epsylon);
    }

    // Setters Test
    // Test setName
    @Test
    public void setNameTest() {
        DessertItem dI = new Candy("Candy Test", 5.5, 4.5);
        dI.setName("Raisin Cookie");
        String name = dI.getName();
        assertEquals(name, "Raisin Cookie");
    }

    // Test setName void
    @Test
    public void setNameTestVoid() {
        DessertItem dI = new Candy("Candy Test", 5.5, 4.5);
        dI.setName("");
        String name = dI.getName();
        assertEquals(name, "Candy Test");
    }

    // Test setTacPercent
    @Test
    public void setTaxPercentTest() {
        DessertItem dI = new Candy("Candy Test", 5.5, 4.5);
        dI.setTaxPercent(8.5);
        double tax = dI.getTaxPercent();
        double epsylon = 0.000001d;
        assertEquals(tax, 8.5, epsylon);
    }
}
