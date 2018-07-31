package de.miluba.petclinic.services;

import de.miluba.petclinic.model.Vet;

import java.util.Collection;
import java.util.Optional;

public interface VetService {
    Optional<Vet> findById(final Long id);

    Collection<Vet> findAll();

    Vet save(final Vet vet);
}
