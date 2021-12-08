public class Flight {

    private int flightNumber,capacity, seatsbooked=0;
    private String flightAirline;

    public Flight(int flightNumber, int capacity, String flightAirline) {
        this.flightNumber = flightNumber;
        this.capacity = capacity;
        this.flightAirline = flightAirline;
    }


    public int getFlightNumber() {
        return flightNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSeatsbooked() {
        return seatsbooked;
    }

    public String getFlightAirline() {
        return flightAirline;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setFlightAirline(String flightAirline) {
        this.flightAirline = flightAirline;
    }

    public boolean checkSeatAvailability()
    {
        System.out.println("checking is any seat is available");

        return true;
    }

    public void updateseat()
    {
        System.out.println("updating  the seat");
        seatsbooked++;
    }

}
