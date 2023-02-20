package RealEstate;

public class Condo extends Residential {
    private int floorLvl;

    public Condo() {
        super();
        this.floorLvl = 0;
    }

    public Condo(String streetAddress, String zip, double bedCount, double bathCount, double sqFootage, int floorLvl) {
        super(streetAddress, zip, bedCount, bathCount, sqFootage);
        setFloorLvl(floorLvl);
    }

    public int getFloorLvl() {
        return floorLvl;
    }

    public void setFloorLvl(int floorLvl) {
        this.floorLvl = floorLvl;
    }
}
