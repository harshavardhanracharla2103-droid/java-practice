import java.util.*;

class Flight {
    private String flightNumber;
    private String destination;
    private int economySeats;
    private int businessSeats;
    private double basePrice;
    
    private String origin = "HYD Rajiv Gandhi International Airport";
    private int currentEcoRow = 3;
    private int currentBusRow = 1;

    public Flight(String flightNumber, String destination, int eco, int bus, double price) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.economySeats = eco;
        this.businessSeats = bus;
        this.basePrice = price;
    }

    public String getFlightNumber() { return flightNumber; }

    public boolean canAccommodate(String type, int count) {
        if (type.equalsIgnoreCase("Business")) return businessSeats >= count;
        return economySeats >= count;
    }

    public void generateTickets(String type, boolean isWindow, int count) {
        Random rand = new Random();
        double totalBill = 0;
        
        System.out.println("\n============================================================");
        System.out.println("                OFFICIAL AIRLINE TICKET                    ");
        System.out.println("============================================================");
        
        for (int i = 0; i < count; i++) {
            int receiptID = 100000 + rand.nextInt(900000);
            String seatLetter = isWindow ? "A" : "B";
            String seatNumber;
            double ticketPrice = basePrice;

            if (type.equalsIgnoreCase("Business")) {
                seatNumber = currentBusRow + seatLetter;
                businessSeats--;
                currentBusRow++; 
                ticketPrice *= 5;
            } else {
                seatNumber = currentEcoRow + seatLetter;
                economySeats--;
                currentEcoRow++;
            }
            
            if (isWindow) ticketPrice += 2154.0;
            totalBill += ticketPrice;

            System.out.println("Ticket ID: #" + receiptID);
            System.out.println("Flight: " + flightNumber + " | Class: " + type);
            System.out.println("FROM: " + origin);
            System.out.println("TO:   " + destination);
            System.out.println("Seat: " + seatNumber + " | Price: " + ticketPrice + "/-");
            System.out.println("------------------------------------------------------------");
        }
        
        System.out.println("============================================================");
        System.out.printf("TOTAL AMOUNT PAID: %.2f/-\n", totalBill);
        System.out.println("============================================================\n");
    }

    @Override
    public String toString() {
        return String.format("| Flight: %-6s | To: %-10s | Eco: %-2d | Bus: %-2d |", 
                flightNumber, destination, economySeats, businessSeats);
    }
}

public class FINALPROJECT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Flight> flights = new ArrayList<>();
        
        flights.add(new Flight("XY101", "GOA", 36, 10, 10653.0));
        flights.add(new Flight("XY102", "MUMBAI", 45, 11, 21456.0));
        flights.add(new Flight("XY103", "CHENNAI", 50, 15, 19876.0));
        flights.add(new Flight("XY104", "DELHI", 36, 10, 15653.0));
        flights.add(new Flight("XY105", "PUNE", 45, 11, 14456.0));

        while (true) {
            try {
                System.out.println("1. View Flights  2. Book Ticket  3. Exit");
                System.out.print("Select Option: ");
                int choice = sc.nextInt();
                sc.nextLine(); 

                if (choice == 1) {
                    System.out.println("\n------------------------------------------------------------");
                    flights.forEach(System.out::println);
                    System.out.println("------------------------------------------------------------\n");
                } 
                else if (choice == 2) {
                    System.out.print("Enter Flight Number: ");
                    String fNum = sc.nextLine().toUpperCase();
                    
                    Flight selected = null;
                    for (Flight f : flights) { 
                        if (f.getFlightNumber().equals(fNum)) selected = f; 
                    }

                    if (selected == null) { 
                        System.out.println("Error: Flight not found!"); 
                        continue; 
                    }

                    System.out.print("Number of Tickets (1-5): ");
                    int count = sc.nextInt(); 
                    sc.nextLine();

                    if (count < 1 || count > 5) { 
                        System.out.println("!! INVALID BOOKING COUNT !!"); 
                        continue; 
                    }

                    System.out.print("Class (Economy/Business): ");
                    String cabin = sc.nextLine();

                    if (!selected.canAccommodate(cabin, count)) {
                        System.out.println("Sorry, seats are full! No vacancy ");
                        continue;
                    }

                    System.out.print("Window Seat? (yes/no): ");
                    boolean window = sc.nextLine().equalsIgnoreCase("yes");

                    selected.generateTickets(cabin, window, count);
                } 
                else break;
            } catch (Exception e) {
                System.out.println("!! Input Error! Please try again !!");
                sc.nextLine();
            }
        }
        System.out.println("Thank you for using the Flight Booking System !");
        System.out.println("HAVE A NICE AND SAFE JOURNEY ....");
    }
}