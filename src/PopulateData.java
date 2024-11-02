import java.util.Date;

public class PopulateData {
    public static void populate(Basic app) {
        // Create hosts
        Host host1 = new Host(1, new Date(), "Doe", "John");
        Host host2 = new Host(2, new Date(), "Smith", "Jane");
        Host host3 = new Host(3, new Date(), "Brown", "Bob");

        // Create properties
        Property property1 = new Property("New York", 2, 3, 100.0f, 1);
        Property property2 = new Property("Los Angeles", 3, 4, 150.0f, 2);
        Property property3 = new Property("Chicago", 1, 2, 80.0f, 3);

        // Create users
        User user1 = new User(new Date(), "Alice", "Johnson", 1);
        User user2 = new User(new Date(), "Tom", "Harris", 2);
        User user3 = new User(new Date(), "Emily", "Davis", 3);

        // Create bookings for each user
        Booking booking1 = new Booking(user1, property1, new Date(), false, new Date(System.currentTimeMillis() + 5 * 24 * 60 * 60 * 1000)); // 5 days
        Booking booking2 = new Booking(user2, property2, new Date(), false, new Date(System.currentTimeMillis() + 3 * 24 * 60 * 60 * 1000)); // 3 days
        Booking booking3 = new Booking(user3, property3, new Date(), false, new Date(System.currentTimeMillis() + 7 * 24 * 60 * 60 * 1000)); // 7 days

    }
}
