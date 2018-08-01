package de.miluba.petclinic.services.map;

import de.miluba.petclinic.model.Pet;
import de.miluba.petclinic.services.CrudService;
import de.miluba.petclinic.services.PetService;

import java.util.Collection;
import java.util.Optional;

public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Collection<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Optional<Pet> findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
