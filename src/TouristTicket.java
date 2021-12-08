public class TouristTicket {
    private String PNRNumber,departureLocation,destinationLocation,departureDateAndTime,arrivalDateAndTime;
    private float price;
    private boolean isCancelled = false;
    private int seatNo;
    private Flight flight;
    private Passenger passenger;
    private String hotelAddress;

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

    public String getPNRNumber() {
        return PNRNumber;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public String getDepartureDateAndTime() {
        return departureDateAndTime;
    }

    public String getArrivalDateAndTime() {
        return arrivalDateAndTime;
    }

    public float getPrice() {
        return price;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public Flight getFlight() {
        return flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setPNRNumber(String PNRNumber) {
        this.PNRNumber = PNRNumber;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public void setDepartureDateAndTime(String departureDateAndTime) {
        this.departureDateAndTime = departureDateAndTime;
    }

    public void setArrivalDateAndTime(String arrivalDateAndTime) {
        this.arrivalDateAndTime = arrivalDateAndTime;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setHotelAddress(String hotelAddress) {
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
