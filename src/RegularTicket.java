public class RegularTicket {

    private String PNRNumber,departureLocation,destinationLocation,departureDateAndTime,arrivalDateAndTime;
    private float price;
    private boolean isCancelled = false;
    private int seatNo;
    private Flight flight;
    private Passenger passenger;
    private String specialService;

    public RegularTicket(String PNRNumber, String departureLocation, String destinationLocation, String departureDateAndTime, String arrivalDateAndTime, float price, int seatNo, Flight flight, Passenger passenger, String specialService) {
        this.PNRNumber = PNRNumber;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.departureDateAndTime = departureDateAndTime;
        this.arrivalDateAndTime = arrivalDateAndTime;
        this.price = price;
        this.seatNo = seatNo;
        this.flight = flight;
        this.passenger = passenger;
        this.specialService = specialService;
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

    public int getSeatNo() {
        return seatNo;
    }

    public Flight getFlight() {
        return flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public String getSpecialService() {
        return specialService;
    }

    public boolean isCancelled() {
        return isCancelled;
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

    public void setSpecialService(String specialService) {
        this.specialService = specialService;
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
    public void checkAvailedServices() {
        System.out.println("checking availed services");
    }

    public void updateSpecialService(String specialService) {
        this.specialService = specialService;
        System.out.println("setting special services ");
    }





}
