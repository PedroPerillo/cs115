package realEstateOffice;

public class Residential extends Property {

   private int bedCount;
   private  int bathCount;
   private double sqFootage;

    public Residential() {
        super();
        this.bedCount = 1;
        this.bathCount = 1;
        this.sqFootage = 1;
    }

    public Residential(String streetAddress, String zip, int bedCount, int bathCount, double sqFootage) {
        super(streetAddress,zip);
        this.bedCount = bedCount;
        this.bathCount = bathCount;
        this.sqFootage = sqFootage;
    }

    public int getBedCount() {
        return bedCount;
    }

    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }

    public int getBathCount() {
        return bathCount;
    }

    public void setBathCount(int bathCount) {
        this.bathCount = bathCount;
    }

    public double getSize() {
        return sqFootage;
    }

    public void setSize(double sqFootage) {
        this.sqFootage = sqFootage;
    }

}
