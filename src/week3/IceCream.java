package week3;

public class IceCream extends DessertItem{
    private int scoopCount;
    private double pricePerScoop;

    public IceCream(){
        super();
        this.scoopCount = 0;
        this.pricePerScoop = 0;
    }

    public IceCream(String name, int scoopCount, double pricePerScoop){
        super(name);
        this.scoopCount = scoopCount;
        this.pricePerScoop = pricePerScoop;
    }

    public double getPricePerScoop() {
        return pricePerScoop;
    }
    public int getScoopCount() {
        return scoopCount;
    }

    public void setScoopCount(int scoopCount) {
        boolean dw1 = false;
        do {
            if (scoopCount < 0) {
                System.out.println("Please enter a postive number");
            } else {
                this.scoopCount = scoopCount;
                dw1 = true;
            }
        } while (!dw1);
    }
    
    public void setPricePerScoop(double pricePerScoop) {
        boolean dw1 = false;
        do {
            if (pricePerScoop < 0) {
                System.out.println("Please enter a postive number");
            } else {
                this.pricePerScoop = pricePerScoop;
                dw1 = true;
            }
        } while (!dw1);
    }
}
