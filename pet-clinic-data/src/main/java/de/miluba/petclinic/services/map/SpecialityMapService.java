package de.miluba.petclinic.services.map;

import de.miluba.petclinic.model.Speciality;
import de.miluba.petclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class SpecialityMapService extends AbstractMapService<Speciality,Long> implements SpecialityService {
}
