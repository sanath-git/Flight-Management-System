public class Main {
    public static void main(String[] args) {
        Flight flightRegular = new Flight(123, 30, "Spice Jet");
        Flight flightTourist = new Flight(124, 20, "Air India");
        Passenger passengerRegular = new Passenger("sanath", "0987654321", "sanath@gmail.com", "bajakudlu", "perla", "kerala");
        Passenger passengerTourist = new Passenger("virat", "0987654334", "virat@gmail.com", "bejai", "mangalore", "karnataka");

        RegularTicket regularTicket = new RegularTicket("12345", "kerala", "delhi", "08-12-2021 09:50 PM", "08-12-2021 11:00 PM", 999.99f, 13, flightRegular, passengerRegular, "Food");
        TouristTicket touristTicket = new TouristTicket("12346", "Manglore", "banglore", "09-12-2021 10:00 PM", "09-12-2021 11:00 PM", 799.99f, 13, "Moon light hotel banglore", flightTourist, passengerTourist);
        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPNRNumber());
    }
}
