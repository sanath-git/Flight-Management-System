public class Passenger {
    public int id;

    public Passenger(int id) {
        this.id = id;
    }

    public void register(String name, String password)
    {
        System.out.println("user registered");
    }
    public void bookTicket()
    {
        System.out.println("booking ticket");
    }

}
