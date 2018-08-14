package de.miluba.petclinic.services.jpa;

import de.miluba.petclinic.model.Vet;
import de.miluba.petclinic.repositories.VetRepository;
import de.miluba.petclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;

@Service
@Profile("jpa")
public class VetJPAService implements VetService {

    private final VetRepository vetRepository;

    public VetJPAService(final VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Collection<Vet> findAll() {
        Collection<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long id) {
        return vetRepository.findById(id).orElse(null);
    }

    @Override
    public Vet save(Vet vet) {
        return vetRepository.save(vet);
    }

    @Override
    public void delete(Vet vet) {
        vetRepository.delete(vet);
    }

    @Override
    public void deleteById(Long id) {
        vetRepository.deleteById(id);
    }
}
