package pl.sda.bulider;

/**
 * Created by k.czechowski83@gmail.com on 2017-02-25.
 */
public class PersonAddress {
    private String street;
    private String postalCode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String city;
}
