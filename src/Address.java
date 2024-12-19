public class Address {
    private String street;
    private String city;
    private String state;

    Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
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

    @Override
    public String toString() {
        return  street +
                ", " + city +
                ", " + state;
    }
}
