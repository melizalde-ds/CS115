package DessertShop;

public class Cookie extends DessertItem {
    private int cookieQty;
    private double pricePerDozen;

    public Cookie() {
        super();
        this.cookieQty = 0;
        this.pricePerDozen = 0;
    }

    public Cookie(String name, int cookieQty, double pricePerDozen) {
        super(name);
        this.cookieQty = cookieQty;
        this.pricePerDozen = pricePerDozen;
    }

    public int getCookieQty() {
        return cookieQty;
    }

    public double getPricePerDozen() {
        return pricePerDozen;
    }

    public void setCookieQty(int cookieQty) {
        boolean dw1 = false;
        do {
            if (cookieQty < 0) {
                System.out.println("Please enter a postive number");
            } else {
                this.cookieQty = cookieQty;
                dw1 = true;
            }
        } while (!dw1);
    }

    public void setPricePerDozen(double pricePerDozen) {
        boolean dw1 = false;
        do {
            if (pricePerDozen < 0) {
                System.out.println("Please enter a postive number");
            } else {
                this.pricePerDozen = pricePerDozen;
                dw1 = true;
            }
        } while (!dw1);
    }
}
