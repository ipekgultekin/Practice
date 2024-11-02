import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Basic {
    public static ArrayList<User> userList = new ArrayList<>();
    public static ArrayList<Property> propertyList = new ArrayList<>();
    public static ArrayList<Booking> bookingList = new ArrayList<>();

    public static void main(String[] args) {
        Basic obj = new Basic();
        obj.menu();

    }

    public void menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Bed&Breakfast Booking Management System!!");
        int choice;
        do{
            System.out.println("1. Add User\n"
                    + "2. Delete User\n"
                    + "3. Get User Details\n"
                    + "4. Add Property\n"
                    + "5. Delete Property\n"
                    + "6. Get Property Details\n"
                    + "7. Add Booking\n"
                    + "8. Get User Booking\n"
                    + "9. Get Booking Cost\n"
                    + "10. List Users\n"
                    + "11. List Properties\n"
                    + "12. Exit\n"
            );

            System.out.println("Enter a choice: ");
            choice = input.nextInt();

            switch(choice) {
                case 1:
                    addUser();
                    break;
                case 2:
                    System.out.println("Please enter user ID to delete: ");
                    int userID = input.nextInt();
                    deleteUser(userID);
                    break;
                case 3:
                    System.out.println("Please enter user ID to list of details: ");
                    userID = input.nextInt();
                    getUserDetails(userID);
                    break;
                case 4:
                    addProperty();
                    break;
                case 5:
                    System.out.println("Please enter property ID to delete: ");
                    int propertyID = input.nextInt();
                    deleteProperty(propertyID);
                    break;
                case 6:
                    System.out.println("Please enter property ID to list of details: ");
                    propertyID = input.nextInt();
                    getPropertyDetails(propertyID);
                    break;
                case 7:
                    System.out.println("Please enter user ID: ");
                    userID = input.nextInt();
                    System.out.println("Please enter property ID: ");
                    propertyID = input.nextInt();
                    addBooking(userID,propertyID);
                    break;
                case 8:
                    System.out.println("Please enter user ID: ");
                    userID = input.nextInt();
                    input.nextLine();
                    getUserBooking(userID);
                    break;
                case 9:
                    System.out.println("Please enter user ID: ");
                    userID = input.nextInt();
                    input.nextLine();
                    System.out.println("Please enter property ID: ");
                    propertyID = input.nextInt();
                    input.nextLine();
                    getBookingCost(userID,propertyID);
                case 10:
                    listUser();
                    break;
                case 11:
                    listProperties();
                    break;
                case 12:
                    exit();
                    break;
                default:
                    System.out.println("Invalid choice!! ");
                    System.out.println("Sorry!");
                    break;
            }
        }while(choice !=12);

    }

    public static User findUserID(int userID){
        for(User user: userList){
            if(user.getUserID() == userID){
                return user;
            }
        }
        return null;
    }

    public void addUser(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an user id: ");
        int userID = input.nextInt();
        input.nextLine();

        System.out.println("Enter a new user's name: ");
        String name = input.nextLine();

        System.out.println("Enter a new user's surname:");
        String surname = input.nextLine();

        System.out.println("Enter a new user's date of birth: ");
        Date dob = new Date();


        User user = new User(dob, name, surname, userID);
        userList.add(user);
        System.out.println("Added successfully!");

    }

    public void deleteUser(int userID){
        User user = findUserID(userID);
        if(user != null){
            userList.remove(user);
            System.out.println("User deleted!");
        }
        else{
            System.out.println("User is not found. Invalid id.");
        }
    }

    public void getUserDetails(int userID){
        User user = findUserID(userID);
        if(user!=null){
            System.out.println("User is found. Here are the details:");
            System.out.println("User ID: " + user.getUserID());
            System.out.println("User name: " + user.getFirstName());
            System.out.println("User surname: " + user.getLastName());
            System.out.println("Date of birth: " + user.getDateOfBirth());
        }
    }

    public static Property findPropertyID(int propertyID){
        for(Property property : propertyList){
            if(property.getPropertyID() == propertyID){
                return property;
            }
        }
        return null;
    }

    public void addProperty(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a property id: ");
        int propertyID = input.nextInt();
        input.nextLine();

        System.out.println("Enter a number of bed rooms: ");
        int noBedRooms = input.nextInt();
        input.nextLine();

        System.out.println("Enter a number of rooms: ");
        int noRooms = input.nextInt();
        input.nextLine();

        System.out.println("Enter a city: ");
        String city = input.nextLine();

        System.out.println("Enter a price per day: ");
        float price = input.nextFloat();
        input.nextLine();

        Property property = new Property(city, noBedRooms, noRooms, price, propertyID);
        propertyList.add(property);
        System.out.println("Added successfully!");
    }

    public void deleteProperty(int propertyID){
        Property property = findPropertyID(propertyID);
        if(property != null){
            propertyList.remove(property);
            System.out.println("Deleted successfully!");
        }
    }

    public void getPropertyDetails(int propertyID){
        Property property = findPropertyID(propertyID);
        if(property != null){
            System.out.println("Property is found. Here are the details: ");
            System.out.println("Property ID: " + property.getPropertyID());
            System.out.println("Property no of bedrooms: " + property.getNoBedRooms());
            System.out.println("Property no of rooms: " + property.getNoRooms());
            System.out.println("City: " + property.getCity());
            System.out.println("Price per day: " + property.getPricePerDay());
        }
    }

    public void addBooking(int userID, int propertyID){
        Scanner input = new Scanner(System.in);
        User user = findUserID(userID);
        Property property = findPropertyID(propertyID);

        if(user!=null || property !=null){
            System.out.println("Is it paid? (yes/no): ");
            Boolean paid = input.nextBoolean();

            System.out.println("Enter booking start date(dd-MM-yyyy): ");
            String startDate = input.nextLine();

            System.out.println("Enter booking end date(dd-MM-yyyy): ");
            String endDate = input.nextLine();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date start;
            Date end;

            try{
                start = dateFormat.parse(startDate);
                end = dateFormat.parse(endDate);

                if(end.before(start)){
                    System.out.println("End date must be after start date!!!");
                    return;
                }

                Booking booking = new Booking(start,end);
                booking.setPaid(false);

                bookingList.add(booking);
                System.out.println("Added successfully.");
            } catch (ParseException e){

                System.out.println("Invalid date format.");
            }

        }
    }

    public void getUserBooking(int userID){
        User user = findUserID(userID);
        if(user != null){
            boolean hasBooking = false;
            System.out.println("Bookings for user " + user.getUserID());
            for(Booking booking : bookingList){
                if(booking.getUser().getUserID() == userID){
                    hasBooking = true;
                    System.out.println("Start date: " + booking.getStartDate());
                    System.out.println("End date: " + booking.getEndDate());
                    System.out.println("Paid: " + booking.isPaid());

                }
            }
            if(!hasBooking){
                System.out.println("No bookings found for this id.");
            }

        }
    }

    public void getBookingCost(int userID, int propertyID){
        User user = findUserID(userID);
        Property property = findPropertyID(propertyID);

        boolean isFound = false;

        for(Booking booking: bookingList){
            if(booking.getUser().getUserID() == userID && booking.getProperty().getPropertyID() == propertyID){
                isFound = true;
                float cost = booking.totalCost();
                System.out.println("Total cost for booking from " + booking.getStartDate() + " to " + booking.getEndDate() + " is: " + cost);
            }
        }

        if(!isFound){
            System.out.println("No bookings found for user.");
        }
    }

    public void listUser(){
        for(User user: userList){
            System.out.println("User ID: " + user.getUserID());
            System.out.println("Date of Birth: " + user.getDateOfBirth());
            System.out.println("Name: " + user.getFirstName());
            System.out.println("Surname: " + user.getLastName());
        }
    }

    public void listProperties(){
        for(Property property: propertyList){
            System.out.println("Property ID: " + property.getPropertyID());
            System.out.println("No of Bed Rooms: " + property.getNoBedRooms());
            System.out.println("No of Rooms: " + property.getNoRooms());
            System.out.println("City: " + property.getCity());
            System.out.println("Price per day: " + property.getPricePerDay());
        }
    }

    public void exit(){
        System.out.println("Byee!");
    }


}