package de.miluba.petclinic.services;

import de.miluba.petclinic.model.Owner;

import java.util.Collection;
import java.util.Optional;

public interface OwnerService {
    Optional<Owner> findById(final Long id);

    Collection<Owner> findAll();

    Owner save(final Owner owner);
}
