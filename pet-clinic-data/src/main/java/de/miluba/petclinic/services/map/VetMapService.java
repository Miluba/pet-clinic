package de.miluba.petclinic.services.map;

import de.miluba.petclinic.model.Vet;
import de.miluba.petclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
}
