package Mirea.Homework2324;

public final class ImmutableAddress {
    private final String city;
    private final String street;
    private final String house;
    private final String entrance;
    private final String apartment;

    public ImmutableAddress(String city, String street, String house, String entrance, String apartment) {
        this.city = city;
        this.street = street;
        this.house = house;
        this.entrance = entrance;
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getEntrance() {
        return entrance;
    }

    public String getApartment() {
        return apartment;
    }
}
