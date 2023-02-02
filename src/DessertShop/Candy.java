/** 
* File: Candy.java
* Description: This class extends from DessertItem and creates a Candy Object with it's setters and getters.
* Instructor's Name: Barbara Chamberlin
* 
* @author: Miguel Elizalde
* @since: 01/30/2023
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
}
