package week3;

public class Candy extends DessertItem {
    private double candyWeight;
    private double pricePerPound;

    public Candy() {
        super();
        candyWeight = 0;
        pricePerPound = 0;
    }

    public Candy(String name, double candyWeight, double pricePerPound){
        super(name);
        this.candyWeight = candyWeight;
        this. pricePerPound = pricePerPound;
    }

    public double getCandyWeight() {
        return candyWeight;
    }

    public double getPricePerPound() {
        return pricePerPound;
    }

    public void setCandyWeight(double candyWeight) {
        boolean dw1 = false;
        do {
            if (candyWeight < 0) {
                System.out.println("Please enter a postive number");
            } else {
                this.candyWeight = candyWeight;
                dw1 = true;
            }
        } while (!dw1);
    }

    public void setPricePerPound(double pricePerPound) {
        boolean dw1 = false;
        do {
            if (candyWeight < 0) {
                System.out.println("Please enter a postive number");
            } else {
                this.pricePerPound = pricePerPound;
                dw1 = true;
            }
        } while (!dw1);
    }
}
