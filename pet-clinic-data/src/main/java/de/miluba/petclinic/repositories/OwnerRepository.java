package de.miluba.petclinic.repositories;

import de.miluba.petclinic.model.Name;
import de.miluba.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Collection<Owner> findByName(final Name name);
}
