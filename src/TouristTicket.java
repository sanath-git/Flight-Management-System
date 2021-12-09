public class TouristTicket extends Ticket {

    private String hotelAddress;
    private String[] touristLocations = new String[5];

    public TouristTicket(String PNRNumber, String departureLocation, String destinationLocation, String departureDateAndTime, String arrivalDateAndTime, float price, int seatNo, String hotelAddress, Flight flight, Passenger passenger) {
//        calling ticket constuctor using super keyword
        super(PNRNumber, departureLocation, destinationLocation, departureDateAndTime, arrivalDateAndTime, price, seatNo, flight, passenger);
        this.hotelAddress = hotelAddress;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public String[] getTouristLocations() {
        return touristLocations;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public void addTouristLocation(String location) {
        System.out.println("adding location");
    }

    public void removeTouristLocation(String location) {
        System.out.println("removing location");
    }
}
