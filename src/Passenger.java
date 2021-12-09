public class Passenger {
    private int id;
    private Ticket ticket;
    private Contact contact;
    private Address address;
    private static int idCounter = 0;

    public Passenger(String name, String phoneNumber, String emailId, String street, String city, String state) {
        id = idCounter;
        this.contact = new Contact(name, phoneNumber, emailId);
        this.address = new Address(street, city, state);
        idCounter++;
    }

    public int getPassengerCount() {
        return idCounter;
    }

    public int getId() {
        return id;
    }

    public void register(String name, String password) {
        System.out.println("user registered");
    }

    public void bookTicket() {
        System.out.println("booking ticket");
    }

//    creating a inner class address

    private static class Address {
        private String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }

        public String getStreet() {
            return street;
        }

        public String getCity() {
            return city;
        }

        public String getState() {
            return state;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
    //    creating a inner class Contact
    private static class Contact {
        private String name;
        private String phoneNumber;
        private String emailId;

        public Contact(String name, String phoneNumber, String emailId) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.emailId = emailId;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getEmailId() {
            return emailId;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }
    }


}
