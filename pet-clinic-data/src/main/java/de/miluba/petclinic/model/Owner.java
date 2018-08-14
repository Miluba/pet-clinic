package de.miluba.petclinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "owner")
public class Owner extends Person {

    @OneToMany(
            mappedBy = "owner",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private final Set<Pet> pets = new HashSet<>();
    @Embedded
    private Address address;
    @Column(name = "telephone")
    private String telephone;

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
