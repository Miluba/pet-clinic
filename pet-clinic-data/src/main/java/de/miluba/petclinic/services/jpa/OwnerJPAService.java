package de.miluba.petclinic.services.jpa;

import de.miluba.petclinic.model.Name;
import de.miluba.petclinic.model.Owner;
import de.miluba.petclinic.repositories.OwnerRepository;
import de.miluba.petclinic.services.OwnerService;
import de.miluba.petclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;

@Service
@Profile("jpa")
public class OwnerJPAService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetService petService;

    public OwnerJPAService(OwnerRepository ownerRepository, PetService petService) {
        this.ownerRepository = ownerRepository;
        this.petService = petService;
    }

    @Override
    public Collection<Owner> findByName(final Name name) {
        return ownerRepository.findByName(name);
    }

    @Override
    public Collection<Owner> findAll() {
        Collection<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Optional<Owner> findById(Long id) {
        return ownerRepository.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public void delete(Owner owner) {
        ownerRepository.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
        ownerRepository.deleteById(id);

    }
}
