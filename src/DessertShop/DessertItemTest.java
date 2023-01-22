package DessertShop;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DessertItemTest {
    @Test
    public void getNameTest() {
        DessertItem dI = new DessertItem("Apple Pie");
        String name = dI.getName();
        assertEquals(name, "Apple Pie");
    }

    @Test
    public void setNameTest() {
        DessertItem dI = new DessertItem("Apple Pie");
        dI.setName("Raisin Cookie");
        String name = dI.getName();
        assertEquals(name, "Raisin Cookie");
    }
}
