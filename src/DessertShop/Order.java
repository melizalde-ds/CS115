/** 
* File: Order.java
* Description: This class creates an Object call Order and stores DessertItems on an ArrayList
* Instructor's Name: Barbara Chamberlin
* 
* @author: Miguel Elizalde
* @since: 01/30/2023
*/
package DessertShop;

import java.util.ArrayList;

public class Order {
    // Class variable
    private ArrayList<DessertItem> order;

    /**
     * Constructor Order()
     * Description: Order constructor
     * Returns: Order Object
     * 
     * @return Candy Obejct
     */
    public Order() {
        order = new ArrayList<DessertItem>();
    }

    /**
     * Method Name: getOrder
     * Description: Returns the ArrayList with the items of the order
     * Returns: order
     * 
     * @return ArrayList order
     */
    public ArrayList<DessertItem> getOrder() {
        return order;
    }

    /**
     * Method Name: itemCount
     * Description: Returns the size of the ArrayList
     * Returns: order.size()
     * 
     * @return int size
     */
    public int itemCount() {
        return order.size();
    }

    /**
     * Method Name: add(parameter)
     * Description: adds a DessertItem to the order
     * Returns: void
     * 
     * @param DesserItem dessert
     * @return void
     */
    public void add(DessertItem dessert) {
        order.add(dessert);
    }

    public double ordeCost() {
        double totalCost = 0;
        for (DessertItem dessertItem : order) {
            totalCost += dessertItem.calculateCost();
        }
        return totalCost;
    }

    public double orderTax() {
        double totalTax = 0;
        for (DessertItem dessertItem : order) {
            totalTax += dessertItem.calculateTax(dessertItem.calculateCost());
        }
        return totalTax;
    }

    @Override
    public String toString() {
        String finalOutput = "";
        finalOutput += "------------------------Receipt-------------------";
        for (int i = 0; i < order.size(); i++) {
            finalOutput += order.get(i).toString();
        }
        finalOutput += finalOutput += "--------------------------------------------------";
        return finalOutput;
    }
}
