package de.miluba.petclinic.services;

import java.util.Collection;
import java.util.Optional;

public interface CrudService<T, ID> {
    Collection<T> findAll();

    T findById(final ID id);

    T save(final T object);

    void delete(final T object);

    void deleteById(final ID id);
}
