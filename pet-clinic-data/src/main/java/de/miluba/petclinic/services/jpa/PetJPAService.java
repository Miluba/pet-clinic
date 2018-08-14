package de.miluba.petclinic.services.jpa;

import de.miluba.petclinic.model.Pet;
import de.miluba.petclinic.repositories.PetRepository;
import de.miluba.petclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;

@Service
@Profile("jpa")
public class PetJPAService implements PetService {

    private final PetRepository petRepository;

    public PetJPAService(final PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Collection<Pet> findAll() {
        Collection<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Optional<Pet> findById(Long id) {
        return petRepository.findById(id);
    }

    @Override
    public Pet save(Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public void delete(Pet pet) {
        petRepository.delete(pet);
    }

    @Override
    public void deleteById(Long id) {
        petRepository.deleteById(id);
    }
}
