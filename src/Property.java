public class Property {
    private int propertyID;
    private int noBedRooms;
    private int noRooms;
    private String city;
    private float pricePerDay;

    public Property(String city, int noBedRooms, int noRooms, float pricePerDay, int propertyID) {
        this.city = city;
        this.noBedRooms = noBedRooms;
        this.noRooms = noRooms;
        this.pricePerDay = pricePerDay;
        this.propertyID = propertyID;
    }

    public Property(int noBedRooms, int propertyID, int noRooms, float pricePerDay) {
        this.noBedRooms = noBedRooms;
        this.propertyID = propertyID;
        this.noRooms = noRooms;
        this.pricePerDay = pricePerDay;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNoBedRooms() {
        return noBedRooms;
    }

    public void setNoBedRooms(int noBedRooms) {
        this.noBedRooms = noBedRooms;
    }

    public int getNoRooms() {
        return noRooms;
    }

    public void setNoRooms(int noRooms) {
        this.noRooms = noRooms;
    }

    public float getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(float pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public int getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(int propertyID) {
        this.propertyID = propertyID;
    }
}
