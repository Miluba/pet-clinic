package de.miluba.petclinic.model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Vet")
@Table(name = "vet")
public class Vet extends Person {

    @ManyToMany(mappedBy = "vets")
    private final Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public boolean addSpeciality(final Speciality speciality) {
        return specialities.add(speciality);
    }

    public boolean removeSpeciality(final Speciality speciality) {
        return specialities.remove(speciality);
    }
}
