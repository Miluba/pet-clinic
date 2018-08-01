package de.miluba.petclinic.services.map;

import de.miluba.petclinic.model.Owner;
import de.miluba.petclinic.services.CrudService;
import de.miluba.petclinic.services.OwnerService;

import java.util.Collection;
import java.util.Optional;

public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Collection<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner);
    }

    @Override
    public Optional<Owner> findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Optional<Owner> findByLastName(String lastName) {
        return Optional.empty();
    }
}
