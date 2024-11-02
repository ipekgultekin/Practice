import java.util.Date;

public class Booking {
    private Date startDate;
    private Date endDate;
    private boolean isPaid;

    public Booking(Date endDate, boolean isPaid, Date startDate) {
        this.endDate = endDate;
        this.isPaid = isPaid;
        this.startDate = startDate;
    }

    public Booking(Date endDate, Date startDate) {
        this.endDate = endDate;
        this.startDate = startDate;
    }

    /*public float totalCost(){

    }*/

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
