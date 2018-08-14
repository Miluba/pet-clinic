package de.miluba.petclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "Owner")
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

    public void addPet(final Pet pet) {
        pets.add(pet);
    }

    public void removePet(final Pet pet) {
        pets.remove(pet);
    }
}
