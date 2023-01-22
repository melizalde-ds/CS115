package DessertShop;
import java.util.ArrayList;

public class Order {
    private ArrayList<DessertItem> order;

    public Order(){
        order = new ArrayList<DessertItem>();
    }

    public ArrayList<DessertItem> getOrder() {
        return order;
    }

    public void add(DessertItem dessert){
        order.add(dessert);
    }

    public int itemCount(){
        return order.size();
    }
}
