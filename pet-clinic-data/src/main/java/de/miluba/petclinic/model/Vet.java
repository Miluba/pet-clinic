package de.miluba.petclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {

    private final Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public boolean addSpeciality(Speciality speciality) {
        return specialities.add(speciality);
    }
}
