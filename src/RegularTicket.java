public class RegularTicket {

    public String PNRNumber,departureLocation,destinationLocation,departureDateAndTime,arrivalDateAndTime;
    public float price;
    public boolean isCancelled = false;
    public int seatNo;
    public Flight flight;
    public Passenger passenger;
    public String specialService;

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
