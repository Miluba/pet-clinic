package de.miluba.petclinic.services.map;

import de.miluba.petclinic.model.Vet;
import de.miluba.petclinic.services.CrudService;
import de.miluba.petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Collection<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet);
    }

    @Override
    public Optional<Vet> findById(Long id) {
        return super.findById(id);
    }
}
