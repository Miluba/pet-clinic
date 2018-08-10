package de.miluba.petclinic.model;

public class Address {

    private final String houseNumber;
    private final String street;
    private final String zipCode;
    private final String city;
    private final String country;

    public Address(String houseNumber, String street, String zipCode, String city, String country) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
    }
}
