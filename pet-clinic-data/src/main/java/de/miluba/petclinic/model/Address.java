package de.miluba.petclinic.model;

public class Address {

    private String houseNumber;
    private String street;
    private String zipCode;
    private String city;
    private String country;

    public Address(String houseNumber, String street, String zipCode, String city, String country) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
    }
}
