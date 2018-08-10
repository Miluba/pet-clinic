package de.miluba.petclinic.services.map;

import de.miluba.petclinic.model.Owner;
import de.miluba.petclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Optional<Owner> findByLastName(String lastName) {
        return Optional.empty();
    }
}
