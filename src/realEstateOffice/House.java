package realEstateOffice;

public class House extends Residential{
    public int yardAcres;

    public House(){
        super();
        this.yardAcres = 1;
    }

    public House(String streetAddress, String zip, int bedCount, int bathCount, double sqFootage, int yardAcres) {
        super(streetAddress,zip,bedCount,bathCount,sqFootage);
        this.yardAcres = yardAcres;
    }

    public int getYardAcres() {
        return yardAcres;
    }

    public void setYardAcres(int yardAcres) {
        this.yardAcres = yardAcres;
    }
}
