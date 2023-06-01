package realEstateOffice;

public class Condo extends Residential {

    public int floorLevel;

    public Condo(){
        super();
        this.floorLevel = 1;
    }

    public Condo(String streetAddress, String zip, int bedCount, int bathCount, double sqFootage, int floorLevel) {
        super(streetAddress, zip, bedCount, bathCount, sqFootage);
        this.floorLevel = floorLevel;
    }

    public int getFloorLevel() {
        return floorLevel;
    }

    public void setFloorLevel(int floorLevel) {
        this.floorLevel = floorLevel;
    }
}
