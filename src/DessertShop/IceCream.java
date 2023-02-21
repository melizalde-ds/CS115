/** 
* File: IceCream.java
* Description: This class extends from DessertItem and creates a IceCream Object with it's setters and getters.
* Instructor's Name: Barbara Chamberlin
* 
* @author: Miguel Elizalde
* @since: 01/30/2023
*/
package DessertShop;

public class IceCream extends DessertItem {
    private int scoopCount;
    private double pricePerScoop;

    /**
     * Constructor Name: IceCream()
     * Description: Default constructor
     * Returns: IceCream Object
     * 
     * @return IceCream Object
     */
    public IceCream() {
        super("IceCream");
        this.scoopCount = 0;
        this.pricePerScoop = 0;
    }

    /**
     * Constructor Name: IceCream(parameters)
     * Description: IceCream constructor
     * Returns: IceCream Object
     * 
     * @param String name Name of the IceCream
     * @param int    scoopCount How many scoops the IceCream
     * @param double pricePerScoop Price per scoop
     * @return IceCream Obejct
     */
    public IceCream(String name, int scoopCount, double pricePerScoop) {
        super(name);
        this.scoopCount = 0;
        this.setScoopCount(scoopCount);
        this.pricePerScoop = 0;
        this.setPricePerScoop(pricePerScoop);
    }

    /**
     * Getter
     * Method Name: getPerScoop()
     * Description: Returns the price per scoop
     * Returns: pricePerScoop
     * 
     * @return double pricePerScoop
     */
    public double getPricePerScoop() {
        return pricePerScoop;
    }

    /**
     * Getter
     * Method Name: getScoopCount
     * Description: Returns the scoop count
     * Returns: int ScoopCount
     * 
     * @return int scoopCount
     */
    public int getScoopCount() {
        return scoopCount;
    }

    /**
     * Setter
     * Method Names: setScoopCount
     * Description: Changes or set the count of scoops
     * Returns: void
     * 
     * @param int scoopCount
     * @return void
     */
    public void setScoopCount(int scoopCount) {
        if (scoopCount >= 0) {
            this.scoopCount = scoopCount;
        }
    }

    /**
     * Setter
     * Method Names: setPricePerScoop
     * Description: Changes or set the count of scoops
     * Returns: void
     * 
     * @param double pricePerScoop
     * @return void
     */
    public void setPricePerScoop(double pricePerScoop) {
        if (pricePerScoop >= 0) {
            this.pricePerScoop = pricePerScoop;
        }
    }

    /**
     * Method Name: calculateCost
     * Description: This method override the super method and multiplies the
     * quantity and the scoopCount
     * Returns: double cost
     * 
     * @return double scoopCount * pricePerScoop
     */
    @Override
    public double calculateCost() {
        return scoopCount * pricePerScoop;
    }

    @Override
    public String toString() {
        double cost = calculateCost();
        return String.format("%s\n%d scoops @ $%-25.2f/scoop:$%-8.2f[Tax: $%.2f]\n", getName(), scoopCount,
                pricePerScoop, cost, calculateTax(cost));
    }
}
