package week3;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DessertTest {

    @Test
    public void testGetName() {
        DessertItem dI = new DessertItem("Apple Pie");
        String name = dI.getName();
        assertEquals(name, "Apple Pie");
    }

    @Test
    public void testSetName() {
        DessertItem dI = new DessertItem("Apple Pie");
        dI.setName("Chocolate Cake");
        String name = dI.getName();
        assertEquals(name, "Chocolate Cake");
    }
}
