import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Booking {
    private User user;
    private Property property;
    private Date startDate;
    private Date endDate;
    private boolean isPaid;

    public Booking(Date endDate, boolean isPaid, Date startDate) {
        this.endDate = endDate;
        this.isPaid = isPaid;
        this.startDate = startDate;
    }

    public Booking(Date startDate, Date endDate) {
        this.endDate = endDate;
        this.startDate = startDate;
    }
    public Booking(User user, Property property, Date startDate, boolean isPaid, Date endDate) {
        this.endDate = endDate;
        this.isPaid = isPaid;
        this.property = property;
        this.startDate = startDate;
        this.user = user;
    }


    public Booking() {

    }

    public float totalCost(){
        long duration = endDate.getTime()-startDate.getTime();
        long durationInDays = TimeUnit.DAYS.convert(duration, TimeUnit.HOURS);

        return durationInDays*property.getPricePerDay();
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
