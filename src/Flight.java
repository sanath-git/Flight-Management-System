public class Flight {

    public int flightNumber,capacity, seatsbooked=0;
    public String flightAirline;

    public Flight(int flightNumber, int capacity, String flightAirline) {
        this.flightNumber = flightNumber;
        this.capacity = capacity;
        this.flightAirline = flightAirline;
    }

    public Flight getFlightDetails()
    {
        return this;
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
