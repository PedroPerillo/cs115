package realEstateOffice;

public class Property {

    // Attributes

    private String streetAddress;
    private String zip;

    //constructors
   public Property(){
       super();
        streetAddress = "";
        zip = "";
    }

    public Property(String streetAddress, String zip) {
        this.streetAddress = streetAddress;
        this.zip = zip;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

}
