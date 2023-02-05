/** 
* File: DessertShop.java
* Description: This class creates an order object wiuth Dessert Objects and displays them on the console.
* Instructor's Name: Barbara Chamberlin
* 
* @author: Miguel Elizalde
* @since: 01/30/2023
*/
package DessertShop;

public abstract class DessertShop {
    public static void main(String[] args) {
        // Creates a new order object
        Order order = new Order();
        double orderTotal = 0;
        double totalTax = 0;

        // Adds objects to the class
        order.add(new Candy("Candy Corn", 1.5, .25));
        order.add(new Candy("Gummy Bears", .25, .35));
        order.add(new Cookie("Chocolate Chip", 6, 3.99));
        order.add(new IceCream("Pistachio", 2, .79));
        order.add(new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29));
        order.add(new Cookie("Oatmeal Raisin", 2, 3.45));

        // Prints them to the console
        for (int i = 0; i < order.itemCount(); i++) {
            String dessertName = order.getOrder().get(i).getName();
            double totalCost = order.getOrder().get(i).calculateCost();
            orderTotal += totalCost;
            double tax = order.getOrder().get(i).calculateTax(totalCost);
            totalTax += tax;
            System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n", dessertName, totalCost, tax);
        }
        System.out.println("------------------------------------------------------");
        System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n", "Order Subtotals", orderTotal, totalTax);
        System.out.printf("%-25s$%-8.2f\n", "Order Total:", orderTotal+totalTax);
        System.out.println("\nTotal number of items in order: " + order.itemCount());
    }
}
