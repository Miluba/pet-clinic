package de.miluba.petclinic.services;

import de.miluba.petclinic.model.Name;
import de.miluba.petclinic.model.Owner;

import java.util.Collection;
import java.util.Optional;

public interface OwnerService extends CrudService<Owner, Long> {
    Collection<Owner> findByName(final Name name);
}
