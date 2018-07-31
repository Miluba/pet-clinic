package de.miluba.petclinic.services;

import de.miluba.petclinic.model.Pet;

import java.util.Collection;
import java.util.Optional;

public interface PetService {

    Optional<Pet> findById(final Long id);

    Collection<Pet> findAll();

    Pet save(final Pet pet);
}
