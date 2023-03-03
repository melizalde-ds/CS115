/** 
* File: Cookie.java
* Description: This class extends from DessertItem and creates a Cookie Object with the correspondet setters and getters.
* Instructor's Name: Barbara Chamberlin
* 
* @author: Miguel Elizalde
* @since: 01/30/2023
*/
package DessertShop;

public class Cookie extends DessertItem {
    // Class variables
    private int cookieQty;
    private double pricePerDozen;

    /**
     * Constructor Name: Cookie()
     * Description: Default constructor
     * Returns: Cookie Object
     * 
     * @return Cookie Object
     */
    public Cookie() {
        super("Cookie");
        this.cookieQty = 0;
        this.pricePerDozen = 0;
    }

    /**
     * Constructor Name: Person(parameters)
     * Description: Candy constructor
     * Returns: Candy Object
     * 
     * @param String name Name of the Cookie
     * @param int    cookieQty How many cookies
     * @param double pricePerDozen Price per Dozen cookies
     * @return Cookie Obejct
     */
    public Cookie(String name, int cookieQty, double pricePerDozen) {
        super(name);
        this.cookieQty = 0;
        this.setCookieQty(cookieQty);
        this.pricePerDozen = 0;
        this.setPricePerDozen(pricePerDozen);
    }

    /**
     * Getter
     * Method Name: getCookieQty
     * Description: Returns the quantity of the cookies
     * Returns: cookieQty
     * 
     * @return int cookieQty
     */
    public int getCookieQty() {
        return cookieQty;
    }

    /**
     * Getter
     * Method Name: getPricePerDozen
     * Description: Returns the price per Dozen Cookies
     * Returns: double pricePerDozen
     * 
     * @return double pricePerDozen
     */
    public double getPricePerDozen() {
        return pricePerDozen;
    }

    /**
     * Setter
     * Method Names: setCookieQty
     * Description: Changes or sets how many cookies are
     * Returns: void
     * 
     * @param int cookieQty
     * @return void
     */
    public void setCookieQty(int cookieQty) {
        if (cookieQty >= 0) {
            this.cookieQty = cookieQty;
        }
    }

    /**
     * Setter
     * Method Names: setPricePerDozen
     * Description: Changes or sets the price per dozen cookies.
     * Returns: void
     * 
     * @param int cookieQty
     * @return void
     */
    public void setPricePerDozen(double pricePerDozen) {
        if (pricePerDozen >= 0) {
            this.pricePerDozen = pricePerDozen;
        }
    }

    /**
     * Method Name: calculateCost
     * Description: This method override the super method and multiplies the
     * quantity and the price per dozen
     * Returns: double cost
     * 
     * @return double candyWeight * pricePerPound
     */
    @Override
    public double calculateCost() {
        return (cookieQty * pricePerDozen) / 12;
    }

    @Override
    public String toString() {
        String line1 = getName();
        String line2Pt1 = String.format("%d cookies @ $%.2f/lb.:", getCookieQty(), getPricePerDozen());
        String line2Pt2 = String.format("$%.2f", calculateCost());
        String line2Pt3 = String.format("[Tax: $%.2f]", calculateTax(calculateCost()));
        return String.format("%s\n\t%-45s%s%17s", line1, line2Pt1, line2Pt2, line2Pt3);
    }
}
