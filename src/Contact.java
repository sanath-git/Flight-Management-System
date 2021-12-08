public class Contact {
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
