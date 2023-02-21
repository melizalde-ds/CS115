/** 
* File: Sundae.java
* Description: This class extends from IceCream and creates a Sundae Object with it's setters and getters.
* Instructor's Name: Barbara Chamberlin
* 
* @author: Miguel Elizalde
* @since: 01/30/2023
*/
package DessertShop;

public class Sundae extends IceCream {
    private String toppingName;
    private double toppingPrice;

    /**
     * Constructor Name: Sundae()
     * Description: Default constructor
     * Returns: Sundae Object
     * 
     * @return Sundae Object
     */
    public Sundae() {
        super();
        this.setName("Sundae");
        this.toppingName = "Topping";
        this.toppingPrice = 0;
    }

    /**
     * Constructor Name: Sundae(parameters)
     * Description: Sundae constructor
     * Returns: Sundae Object
     * 
     * @param String name Name of the Dessert
     * @param int    scoopCount How many cookies
     * @param double pricePerScoop Price per Dozen cookies
     * @param String toppingName Name of the topping
     * @param double toppingPrice Price of toppings
     * @return IceCream Obejct
     */
    public Sundae(String name, int scoopCount, double pricePerScoop, String toppingName, double toppingPrice) {
        super(name, scoopCount, pricePerScoop);
        this.toppingName = "";
        this.setToppingName(toppingName);
        this.toppingPrice = 0;
        this.setToppingPrice(toppingPrice);
    }

    /**
     * Getter
     * Method Name: getToppingName()
     * Description: Returns the name of the topping
     * Returns: toppingName
     * 
     * @return String toppingName
     */
    public String getToppingName() {
        return toppingName;
    }

    /**
     * Getter
     * Method Name: getToppingPrice()
     * Description: Returns the price of the Topping
     * Returns: toppingPrice
     * 
     * @return doubleToppingPrice
     */
    public double getToppingPrice() {
        return toppingPrice;
    }

    /**
     * Setter
     * Method Names: setToppingNamme
     * Description: Changes or set the name of the topping
     * Returns: void
     * 
     * @param String toppingName
     * @return void
     */
    public void setToppingName(String toppingName) {
        if (!toppingName.equals("")) {
            this.toppingName = toppingName;
        }
    }

    /**
     * Setter
     * Method Names: setToppingPrice
     * Description: Changes or sets he price of the topping
     * Returns: void
     * 
     * @param double toppingPrice
     * @return void
     */
    public void setToppingPrice(double toppingPrice) {
        if (toppingPrice >= 0) {
            this.toppingPrice = toppingPrice;
        }
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + toppingPrice;
    }

    @Override
    public String toString() {
        double cost = calculateCost();
        return String.format("%s\n%d scoops of %s ice cream @ $%.2f/scoop\n%s topping @ $%-25.2f:$%-8.2f[Tax: $%.2f]\n",
                toppingName + getName(), getScoopCount(), getName(),
                getPricePerScoop(), toppingName, toppingPrice,cost, calculateTax(cost));
    }
}
