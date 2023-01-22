package DessertShop;

public class DessertShop {
    public static void main(String[] args) {
        Order order = new Order();
        order.add(new Candy("Candy Corn", 1.5, .25));
        order.add(new Candy("Gummy Bears", .25, .35));
        order.add(new Cookie("Chocolate Chip", 6, 3.99));
        order.add(new IceCream("Pistachio", 2, .79));
        order.add(new Sundae("Vanilla", 3, .69, "Hot Fudge", 1.29));
        order.add(new Cookie("Oatmeal Raisin", 2, 3.45));

        for (int i = 0; i < order.itemCount(); i++) {
            System.out.println(order.getOrder().get(i).getName());
        }

        System.out.println("\nTotal number of items in order: "+order.itemCount());
    }
}
