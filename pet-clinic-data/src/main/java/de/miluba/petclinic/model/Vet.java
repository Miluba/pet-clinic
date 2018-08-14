package de.miluba.petclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Builder
@Entity(name = "Vet")
@Table(name = "vet")
public class Vet extends Person {

    @ManyToMany
    @JoinTable(name = "vet_speciality",
            joinColumns = @JoinColumn(name = "speciality_id"),
            inverseJoinColumns = @JoinColumn(name = "vet_id"))
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vet vet = (Vet) o;
        return Objects.equals(id, vet.id );
    }

    @Override
    public int hashCode() {
        return 42;
    }
}
