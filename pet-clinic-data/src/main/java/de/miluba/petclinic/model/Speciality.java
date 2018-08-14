package de.miluba.petclinic.model;

import lombok.*;
import org.hibernate.annotations.NaturalId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "Speciality")
@Table(name = "speciality")
public class Speciality extends BaseEntity {

    @Column(name = "speciality")
    @NaturalId
    private String speciality;

    @Column(name = "description")
    private String description;

    @ManyToMany(mappedBy = "specialities")
    private final Set<Vet> vets = new HashSet<>();


    public void addVet(final Vet vet) {
        vets.add(vet);
    }

    public void removeVet(final Vet vet) {
        vets.remove(vet);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speciality tag = (Speciality) o;
        return Objects.equals(speciality, tag.speciality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speciality);
    }
}
