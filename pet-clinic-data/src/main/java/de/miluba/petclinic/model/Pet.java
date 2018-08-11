package de.miluba.petclinic.model;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "pet")
public class Pet extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Enumerated(value = EnumType.STRING)
    private Species species;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @OneToMany(
            mappedBy = "pet",
            orphanRemoval = true,
            cascade = CascadeType.ALL
    )
    private final Set<Visit> visits = new HashSet<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Set<Visit> getVisits() {
        return visits;
    }

    public boolean addVisit(final Visit visit){
        return visits.add(visit);
    }

    public boolean removeVisit(final Visit visit){
        return visits.remove(visit);
    }
}
