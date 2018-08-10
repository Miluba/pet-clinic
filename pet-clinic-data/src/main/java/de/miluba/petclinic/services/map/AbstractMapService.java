package de.miluba.petclinic.services.map;

import de.miluba.petclinic.model.BaseEntity;
import de.miluba.petclinic.services.CrudService;

import java.util.*;

abstract class AbstractMapService<T extends BaseEntity, ID extends Long> implements CrudService<T, ID> {

    private final Map<Long, T> map = new HashMap<>();

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
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
        } else {
            throw new RuntimeException("Object can not be null!");
        }
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


    protected Long getNextId() {
        Long nextId;
        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextId = 1L;
        }

        return nextId;
    }

}
