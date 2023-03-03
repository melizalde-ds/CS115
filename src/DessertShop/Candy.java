/** 
* File: Candy.java
* Description: This class extends from DessertItem and creates a Candy Object with it's setters and getters.
* Instructor's Name: Barbara Chamberlin
* 
* @author: Miguel Elizalde
* @since: 2/3/2023
*/
package DessertShop;

public class Candy extends DessertItem {
    // Class variable
    private double candyWeight;
    private double pricePerPound;

    /**
     * Constructor Name: Candy()
     * Description: Default constructor
     * Returns: Candy Object
     * 
     * @return Candy Object
     */
    public Candy() {
        super("Candy");
        candyWeight = 0;
        pricePerPound = 0;
    }

    /**
     * Constructor Name: Person(parameters)
     * Description: Candy constructor
     * Returns: Candy Object
     * 
     * @param String name Name of the Candy
     * @param double candyWeight Weight of the candy
     * @param double pricePerPound Price of the pound
     * @return Candy Obejct
     */
    public Candy(String name, double candyWeight, double pricePerPound) {
        super(name);
        this.candyWeight = 0;
        this.setCandyWeight(candyWeight);
        this.pricePerPound = 0;
        this.setPricePerPound(pricePerPound);
    }

    /**
     * Getter
     * Method Name: getCandy
     * Description: Returns the weight of the candy
     * Returns: double candy Weight
     * 
     * @return double candyWeight
     */
    public double getCandyWeight() {
        return candyWeight;
    }

    /**
     * Getter
     * Method Name: getPricePerPound
     * Description: Returns the price per pound for the candy
     * Returns: double price
     * 
     * @return double pricePerPound
     */
    public double getPricePerPound() {
        return pricePerPound;
    }

    /**
     * Setter
     * Method Names: setCandyWeight
     * Description: Changes or set the weight of the Candy object
     * Returns: void
     * 
     * @param double candyWeight
     * @return void
     */
    public void setCandyWeight(double candyWeight) {
        if (candyWeight >= 0) {
            this.candyWeight = candyWeight;
        }
    }

    /**
     * Setter
     * Method Names: setPricePerPound
     * Description: Changes or sets the name of the candy object
     * Returns: void
     * 
     * @param double pricePerPound
     * @return void
     */
    public void setPricePerPound(double pricePerPound) {
        if (pricePerPound >= 0) {
            this.pricePerPound = pricePerPound;
        }
    }

    /**
     * Method Name: calculateCost
     * Description: This method override the super method and multiplies the weight
     * and the price per pound
     * Returns: double cost
     * 
     * @return double candyWeight * pricePerPound
     */
    @Override
    public double calculateCost() {
        return candyWeight * pricePerPound;
    }

    @Override
    public String toString() {
        String line1 = getName();
        String line2Pt1 = String.format("%.2f lbs. @ $%.2f/dozen:", getCandyWeight(),getPricePerPound());
        String line2Pt2 = String.format("$%.2f", calculateCost());
        String line2Pt3 = String.format("[Tax: $%.2f]", calculateTax(calculateCost()));
        return String.format("%s\n\t%-45s%s%17s", line1, line2Pt1, line2Pt2, line2Pt3);
    }
}
