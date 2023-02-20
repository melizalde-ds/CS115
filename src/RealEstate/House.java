package RealEstate;

public class House extends Residential {
    private double yardAcres;

    public House() {
        super();
        this.yardAcres = 0;
    }

    public House(String streetAddress, String zip, double bedCount, double bathCount, double sqFootage,
            double yardAcres) {
        super(streetAddress, zip, bedCount, bathCount, sqFootage);
        setYardAcres(yardAcres);
    }

    public double getYardAcres() {
        return yardAcres;
    }

    public void setYardAcres(double yardAcres) {
        this.yardAcres = yardAcres;
    }
}
