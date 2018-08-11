package de.miluba.petclinic.model;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Vet extends Person {

    @ElementCollection
    @CollectionTable(name = "speciality", joinColumns = @JoinColumn(name = "vet_id"))
    private final Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public boolean addSpeciality(final Speciality speciality) {
        return specialities.add(speciality);
    }

    public boolean removeSpeciality(final Speciality speciality){
        return specialities.remove(speciality);
    }
}
