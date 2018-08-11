package de.miluba.petclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Owner extends Person {


    private Address address;
    private String telephone;
    private final Set<Pet> pets = new HashSet<>();

    public boolean addPet(final Pet pet) {
        return pets.add(pet);
    }

    public boolean removePet(final Pet pet) {
        return pets.remove(pet);
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
