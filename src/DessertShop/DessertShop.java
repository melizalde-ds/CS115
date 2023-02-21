/** 
* File: DessertShop.java
* Description: This class creates an order object wiuth Dessert Objects and displays them on the console.
* Instructor's Name: Barbara Chamberlin
* 
* @author: Miguel Elizalde
* @since: 01/30/2023
*/
package DessertShop;

import java.util.Scanner;

public abstract class DessertShop {
    public static void main(String[] args) {
        // Creates a new order object
        Order order1 = new Order();
        double orderTotal = 0;
        double totalTax = 0;

        Scanner sIn = new Scanner(System.in);
        String choice;
        DessertItem orderItem;

        boolean done = false;
        while (!done) {
            System.out.println("\n1: Candy");
            System.out.println("2: Cookie");
            System.out.println("3: Ice Cream");
            System.out.println("4: Sunday");

            System.out.print("What would you like to add to the order? (1-4, Enter for done): ");
            choice = sIn.nextLine();

            if (choice.equals("")) {
                done = true;
            } else {
                switch (choice) {
                    case "1":
                        orderItem = userPromptCandy();
                        order1.add(orderItem);
                        System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                        break;
                    case "2":
                        orderItem = userPromptCookie();
                        order1.add(orderItem);
                        System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                        break;
                    case "3":
                        orderItem = userPromptIceCream();
                        order1.add(orderItem);
                        System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                        break;
                    case "4":
                        orderItem = userPromptSundae();
                        order1.add(orderItem);
                        System.out.printf("%n%s has been added to your order.%n", orderItem.getName());
                        break;
                    default:
                        System.out.println("Invalid response:  Please enter a choice from the menu (1-4)");
                        break;
                }// end of switch (choice)
            } // end of if (choice.equals(""))
        } // end of while (!done)
        System.out.println("\n");

        // Adds objects to the class
        order1.add(new Candy("Candy Corn", 1.5, .25));
        order1.add(new Candy("Gummy Bears", .25, .35));
        order1.add(new Cookie("Chocolate Chip", 6, 3.99));
        order1.add(new IceCream("Pistachio", 2, .79));
        order1.add(new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29));
        order1.add(new Cookie("Oatmeal Raisin", 2, 3.45));

        /*
         * / Prints them to the console
         * for (int i = 0; i < order1.itemCount(); i++) {
         * String dessertName = order1.getOrder().get(i).getName();
         * double totalCost = order1.getOrder().get(i).calculateCost();
         * orderTotal += totalCost;
         * double tax = order1.getOrder().get(i).calculateTax(totalCost);
         * totalTax += tax;
         * System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n", dessertName, totalCost, tax);
         * }
         * System.out.println("------------------------------------------------------");
         * System.out.printf("%-25s$%-8.2f[Tax: $%.2f]\n", "Order Subtotals",
         * orderTotal, totalTax);
         * System.out.printf("%-25s$%-8.2f\n", "Order Total:", orderTotal + totalTax);
         * System.out.println("\nTotal number of items in order: " +
         * order1.itemCount());
         */
        System.out.println(order1);
    }

    private static DessertItem userPromptCandy() {
        String name;
        double weight;
        double price;
        Scanner sI = new Scanner(System.in);

        System.out.print("Enter the name of the Candy: ");
        name = sI.nextLine();
        System.out.print("Enter the weight of the Candy: ");
        weight = Double.parseDouble(sI.nextLine());
        System.out.print("Enter the price per pound: ");
        price = Double.parseDouble(sI.nextLine());

        return new Candy(name, weight, price);
    }

    private static DessertItem userPromptCookie() {
        String name;
        int qty;
        double pPD;

        Scanner sI = new Scanner(System.in);
        System.out.print("Enter the type of Cookie: ");
        name = sI.nextLine();
        System.out.print("Enter the quantity purchased: ");
        qty = Integer.parseInt(sI.nextLine());
        System.out.print("Enter the price per dozen: ");
        pPD = Double.parseDouble(sI.nextLine());

        return new Cookie(name, qty, pPD);
    }

    private static DessertItem userPromptIceCream() {
        Scanner sI = new Scanner(System.in);
        String name;
        int scoopQty;
        double pricePS;

        System.out.print("Enter the type of Ice Cream used: ");
        name = sI.nextLine();
        System.out.print("Enter the number of scoops: ");
        scoopQty = Integer.parseInt(sI.nextLine());
        System.out.print("Enter the price per scoop: ");
        pricePS = Double.parseDouble(sI.nextLine());

        return new IceCream(name, scoopQty, pricePS);
    }

    private static DessertItem userPromptSundae() {
        Scanner sI = new Scanner(System.in);
        String name;
        int scoopQty;
        double pricePS;
        String topping;
        double tPrice;

        System.out.print("Enter the type of Ice Cream: ");
        name = sI.nextLine();
        System.out.print("Enter the number of scoops: ");
        scoopQty = Integer.parseInt(sI.nextLine());
        System.out.print("Enter the price per scoop: ");
        pricePS = Double.parseDouble(sI.nextLine());
        System.out.print("Enter the kind of topping used: ");
        topping = sI.nextLine();
        System.out.print("Enter the price for the topping: ");
        tPrice = Double.parseDouble(sI.nextLine());

        return new Sundae(name, scoopQty, pricePS, topping, tPrice);
    }

}
