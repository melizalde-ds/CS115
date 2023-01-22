package DessertShop;

public class Sundae extends IceCream{
    private String toppingName;
    private double toppingPrice;

    public Sundae(){
        super();
        this.toppingName = "";
        this.toppingPrice = 0;
    }

    public Sundae(String name, int scoopCount, double pricePerScoop, String toppingName, double toppingPrice){
        super(toppingName, scoopCount, pricePerScoop);
        this.toppingName = toppingName;
        this.toppingPrice = toppingPrice;
    }

    public String getToppingName() {
        return toppingName;
    }
    public double getToppingPrice() {
        return toppingPrice;
    }

    public void setToppingName(String toppingName) {
        boolean dw1 = false;
        do {
            if (toppingName.equals("")) {
                System.out.println("Please enter a valid name");
            } else {
                this.toppingName = toppingName;
                dw1 = true;
            }
        } while (!dw1);
    }

    public void setToppingPrice(double toppingPrice) {
        boolean dw1 = false;
        do {
            if (toppingPrice < 0) {
                System.out.println("Please enter a postive number");
            } else {
                this.toppingPrice = toppingPrice;
                dw1 = true;
            }
        } while (!dw1);
    }
}
