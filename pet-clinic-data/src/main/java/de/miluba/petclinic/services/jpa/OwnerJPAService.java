package de.miluba.petclinic.services.jpa;

import de.miluba.petclinic.model.Name;
import de.miluba.petclinic.model.Owner;
import de.miluba.petclinic.repositories.OwnerRepository;
import de.miluba.petclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;

@Service
@Profile("jpa")
public class OwnerJPAService implements OwnerService {

    private final OwnerRepository ownerRepository;

    public OwnerJPAService(final OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
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
    public Owner findById(Long id) {
        return ownerRepository.findById(id).orElse(null);
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
