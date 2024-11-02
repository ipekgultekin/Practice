import java.util.Date;

public class User {
    private int userID;
    private Date dateOfBirth;
    private String firstName;
    private String lastName;


    public User(Date dateOfBirth, String firstName, String lastName, int userID) {
        this.dateOfBirth = new Date();
        this.firstName = firstName;
        this.lastName = lastName;
        this.userID = userID;
    }

    public User(String firstName, String lastName, int userID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userID = userID;
    }

    public User() {

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
