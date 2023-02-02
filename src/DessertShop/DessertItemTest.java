/** 
* File: DessertItemTest.java 
* Description: This class test the Class constructors, setters, and getters from DessertItem Class  
* Instructor's Name: Barbara Chamberlin
* 
* @author: Miguel Elizalde
* @since: 02/01/2023
*/
package DessertShop;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

// Tests for the Person class
public class DessertItemTest {
    // Test Constructor
    @Test
    public void constructorTest() {
        DessertItem dI = new DessertItem();
        String name = dI.getName();
        assertEquals(name, "Dessert");
    }

    // Getters Test
    // Test getName
    @Test
    public void getNameTest() {
        DessertItem dI = new DessertItem("Apple Pie");
        String name = dI.getName();
        assertEquals(name, "Apple Pie");
    }

    // Setters Test
    // Test setName
    @Test
    public void setNameTest() {
        DessertItem dI = new DessertItem("Apple Pie");
        dI.setName("Raisin Cookie");
        String name = dI.getName();
        assertEquals(name, "Raisin Cookie");
    }
}
