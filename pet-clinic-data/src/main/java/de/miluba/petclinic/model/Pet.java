package de.miluba.petclinic.model;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "Pet")
@Table(name = "pet")
public class Pet extends BaseEntity {

    @OneToMany(
            mappedBy = "pet",
            orphanRemoval = true,
            cascade = CascadeType.ALL
    )
    private final Set<Visit> visits = new HashSet<>();
    @Column(name = "name")
    private String name;
    @Enumerated(value = EnumType.STRING)
    private Species species;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private Owner owner;
    @Column(name = "birth_date")
    private LocalDate birthDate;

    public boolean addVisit(final Visit visit) {
        return visits.add(visit);
    }

    public boolean removeVisit(final Visit visit) {
        return visits.remove(visit);
    }
}
