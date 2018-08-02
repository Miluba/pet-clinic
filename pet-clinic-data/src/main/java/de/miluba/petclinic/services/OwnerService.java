package de.miluba.petclinic.services;

import de.miluba.petclinic.Owner;

import java.util.Optional;

public interface OwnerService extends CrudService<Owner, Long> {
    Optional<Owner> findByLastName(final String lastName);
}
