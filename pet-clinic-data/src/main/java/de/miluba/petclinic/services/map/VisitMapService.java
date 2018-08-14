package de.miluba.petclinic.services.map;

import de.miluba.petclinic.model.Visit;
import de.miluba.petclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default","map"})
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {
}
