/** 
* File: DessertItem.java
* Description: This class creats a DessertItem Object with it's setters and getters
* Instructor's Name: Barbara Chamberlin
* 
* @author: Miguel Elizalde
* @since: 01/22/2023
*/
package DessertShop;

public class DessertItem {
    // Class variable
    private String name;

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
        this.name = name;
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
}
