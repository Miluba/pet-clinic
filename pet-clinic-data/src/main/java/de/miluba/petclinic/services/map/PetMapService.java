package de.miluba.petclinic.services.map;

import de.miluba.petclinic.model.Pet;
import de.miluba.petclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default","map"})
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
}
