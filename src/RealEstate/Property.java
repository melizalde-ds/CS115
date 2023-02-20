package RealEstate;

public class Property {
    private String streetAddress;
    private String zip;

    public Property() {
        streetAddress = "";
        zip = "";
    }

    public Property(String streetAddress, String zip) {
        setStreetAddress(streetAddress);
        setZip(zip);
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getZip() {
        return zip;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

}
