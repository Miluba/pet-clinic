package de.miluba.petclinic.repositories;

import de.miluba.petclinic.model.Name;
import de.miluba.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Collection<Owner> findByName(final Name name);
}
