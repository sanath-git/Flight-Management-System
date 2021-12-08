public class RegularTicket extends Ticket {

    private String specialService;

    public RegularTicket(String PNRNumber, String departureLocation, String destinationLocation, String departureDateAndTime, String arrivalDateAndTime, float price, int seatNo, Flight flight, Passenger passenger,String specialService) {
        super(PNRNumber,departureLocation,destinationLocation,departureDateAndTime,arrivalDateAndTime,price,seatNo,flight,passenger);
        this.specialService = specialService;
    }

    public void checkStatus() {
        System.out.println("checking status");
    }

    public String getSpecialService() {
        return specialService;
    }

    public void checkAvailedServices() {
        System.out.println("checking availed services");
    }

    public void updateSpecialService(String specialService) {
        this.specialService = specialService;
        System.out.println("setting special services ");
    }
}

