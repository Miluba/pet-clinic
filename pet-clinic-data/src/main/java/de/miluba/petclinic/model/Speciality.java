package de.miluba.petclinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Speciality")
@Table(name = "speciality")
public class Speciality extends BaseEntity {

    @Column(name = "speciality")
    private String speciality;

    @Column(name = "description")
    private String description;

    @ManyToMany(
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinTable(name = "vet_speciality",joinColumns = @JoinColumn(name = "speciality_id"),
            inverseJoinColumns =@JoinColumn(name = "vet_id") )
    private final Set<Vet> vets = new HashSet<>();

    public Speciality() {
    }

    public Speciality(String speciality, String description) {
        this.speciality = speciality;
        this.description = description;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Vet> getVets() {
        return vets;
    }

    public void addVet(final Vet vet){
        vets.add(vet);
    }

    public void removeVet(final Vet vet){
        vets.remove(vet);
    }
}
