package de.miluba.petclinic.services.map;

import de.miluba.petclinic.model.Vet;
import de.miluba.petclinic.services.CrudService;

import java.util.Collection;
import java.util.Optional;

class VetMapService extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
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
        return super.save(vet.getId(), vet);
    }

    @Override
    public Optional<Vet> findById(Long id) {
        return super.findById(id);
    }
}
