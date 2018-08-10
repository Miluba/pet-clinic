package de.miluba.petclinic.services.map;

import de.miluba.petclinic.model.Pet;
import de.miluba.petclinic.services.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
}
