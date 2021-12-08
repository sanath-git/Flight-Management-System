public class Main {
    public static void main(String[] args) {
        System.out.println("working");
        Flight flight = new Flight(123,30,"space jet");
        System.out.println(flight.getFlightAirline());
        System.out.println(flight.getFlightNumber());
        System.out.println(flight.getCapacity());
    }
}
