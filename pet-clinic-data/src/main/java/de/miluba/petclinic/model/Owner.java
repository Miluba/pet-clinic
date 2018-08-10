package de.miluba.petclinic.model;

import java.util.Set;

public class Owner extends Person {


    private Address address;
    private String telephone;
    private Set<Pet> pets;

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
