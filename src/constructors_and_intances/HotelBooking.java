package constructors_and_intances;

public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard";
        this.nights = 1;
        System.out.println("Default booking created.");
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
        System.out.println("Parameterized booking created.");
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
        System.out.println("Copy booking created.");
    }

    // Method to display booking details
    public void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("--------------------------");
    }

    // Main method to test
    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();  // Default constructor
        HotelBooking booking2 = new HotelBooking("Alice", "Deluxe", 3);  // Parameterized
        HotelBooking booking3 = new HotelBooking(booking2);  // Copy constructor

        System.out.println("Booking 1:");
        booking1.displayBooking();

        System.out.println("Booking 2:");
        booking2.displayBooking();

        System.out.println("Booking 3 (Copy of Booking 2):");
        booking3.displayBooking();
    }
}