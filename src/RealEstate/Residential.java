package RealEstate;

public class Residential extends Property {
    private double bedCount;
    private double bathCount;
    private double sqFootage;

    public Residential() {
        super();
        this.bedCount = 0;
        this.bathCount = 0;
        this.sqFootage = 0;
    }

    public Residential(String streetAddress, String zip, double bedCount, double bathCount, double sqFootage) {
        super(streetAddress, zip);
        setBedCount(bedCount);
        setBathCount(bathCount);
        setSqFootage(sqFootage);
    }

    public double getBedCount() {
        return bedCount;
    }

    public double getBathCount() {
        return bathCount;
    }

    public double getSqFootage() {
        return sqFootage;
    }

    public void setBedCount(double bedCount) {
        this.bedCount = bedCount;
    }

    public void setBathCount(double bathCount) {
        this.bathCount = bathCount;
    }

    public void setSqFootage(double sqFootage) {
        this.sqFootage = sqFootage;
    }
}
