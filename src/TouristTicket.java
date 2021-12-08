public class TouristTicket {
    public String PNRNumber,departureLocation,destinationLocation,departureDateAndTime,arrivalDateAndTime;
    public float price;
    public boolean isCancelled = false;
    public int seatNo;
    public Flight flight;
    public Passenger passenger;
    public String hotelAddress;

    public TouristTicket(String PNRNumber, String departureLocation, String destinationLocation, String departureDateAndTime, String arrivalDateAndTime, float price, int seatNo, Flight flight, Passenger passenger, String hotelAddress) {
        this.PNRNumber = PNRNumber;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.departureDateAndTime = departureDateAndTime;
        this.arrivalDateAndTime = arrivalDateAndTime;
        this.price = price;
        this.seatNo = seatNo;
        this.flight = flight;
        this.passenger = passenger;
        this.hotelAddress = hotelAddress;

    }
    public float durationOfTheJourney() {
        System.out.println("calculating the duration");
        return 0;
    }

    public void checkStatus()
    {
        System.out.println("checking status");
    }

    public void cancelTicket()
    {
        this.isCancelled = true;
    }

    public void addTouristLocation(String location)
    {
        System.out.println("adding location");
    }
    public void removeTouristLocation(String location)
    {
        System.out.println("removing location");
    }

}
