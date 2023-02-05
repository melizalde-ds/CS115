/** 
* File: DessertItem.java
* Description: This class creats a DessertItem Object with it's setters and getters
* Instructor's Name: Barbara Chamberlin
* 
* @author: Miguel Elizalde
* @since: 2/3/2023
*/
package DessertShop;

public abstract class DessertItem {
    // Class attributes
    private String name;
    private double taxPercent = 7.25;

    /**
     * Constructor Name: DessertItem()
     * Description: Default constructor
     * Returns: DessertItem Object
     * 
     * @return DessertItem Object
     */
    public DessertItem() {
        name = "Dessert";
    }

    /**
     * Constructor Name: Person(parameters)
     * Description: DessertItem constructor
     * Returns: DessertItem Object
     * 
     * @param name Name of the Dessert
     * @return DessertItem Object
     */
    public DessertItem(String name) {
        this.setName(name);
    }

    /**
     * Setter
     * Method Names: setName
     * Description: Changes oor sets the name of the Dessert
     * Returns: void
     * 
     * @param String name
     * @return void
     */
    public void setName(String name) {
        if (!name.equals("")) {
            this.name = name;
        }
    }

    /**
     * Setter
     * Method Names: setTaxPercent
     * Description: Changes oor sets the tax Percent
     * Returns: void
     * 
     * @param double taxPercent
     * @return void
     */
    public void setTaxPercent(double taxPercent) {
        this.taxPercent = taxPercent;
    }

    /**
     * Getter
     * Method Names: getName
     * Description: Returns the name of the Dessert
     * Returns: String
     * 
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter
     * Method Names: getTaxPercent
     * Description: Returns the name of the Dessert
     * Returns: String
     * 
     * @return String name
     */
    public double getTaxPercent() {
        return taxPercent;
    }

    // Abstract Method calculateCost()
    public abstract double calculateCost();

    /**
     * Method Names: calculateTax
     * Description: This method calculate the taxes
     * Returns: taxparcent
     * 
     * @param double cost
     * @return double tax
     */
    public double calculateTax(double cost) {
        return (taxPercent / 100) * cost;
    }
}
