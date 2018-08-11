package de.miluba.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

    @Column(name = "house_number")
    private final String houseNumber;
    @Column(name = "street")
    private final String street;
    @Column(name = "zip_code")
    private final String zipCode;
    @Column(name = "city")
    private final String city;
    @Column(name = "country")
    private final String country;

    public Address(String houseNumber, String street, String zipCode, String city, String country) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
    }
}
