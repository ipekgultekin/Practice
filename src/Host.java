import java.util.Date;

public class Host {
    private int hostID;
    private String firstName;
    private String lastName;
    private Date registrationDate;

    public Host(int hostID, Date registrationDate, String lastName, String firstName) {
        this.hostID = hostID;
        this.registrationDate = registrationDate;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Host(String firstName, int hostID, String lastName) {
        this.firstName = firstName;
        this.hostID = hostID;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getHostID() {
        return hostID;
    }

    public void setHostID(int hostID) {
        this.hostID = hostID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}
