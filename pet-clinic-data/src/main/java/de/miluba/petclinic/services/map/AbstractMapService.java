package de.miluba.petclinic.services.map;

import de.miluba.petclinic.model.BaseEntity;
import de.miluba.petclinic.services.CrudService;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

abstract class AbstractMapService<T extends BaseEntity<ID>, ID extends Long> implements CrudService<T, ID> {

    final Map<ID, T> map = new HashMap<>();

    @Override
    public Collection<T> findAll() {
        return map.values();
    }

    @Override
    public Optional<T> findById(final ID id) {
        return Optional.of(map.get(id));
    }

    @Override
    public T save(final T object) {
        return map.put(object.getId(), object);
    }

    @Override
    public void delete(final T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    @Override
    public void deleteById(final ID id) {
        map.remove(id);
    }

}
