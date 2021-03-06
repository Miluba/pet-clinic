package de.miluba.petclinic.services.map;

import de.miluba.petclinic.model.Name;
import de.miluba.petclinic.model.Owner;
import de.miluba.petclinic.model.Pet;
import de.miluba.petclinic.services.OwnerService;
import de.miluba.petclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;

@Service
@Profile({"default", "map"})
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetService petService;

    public OwnerMapService(PetService petService) {
        this.petService = petService;
    }

    @Override
    public Collection<Owner> findByName(final Name lastName) {
        return new HashSet<>();
    }

    @Override
    public Owner save(final Owner owner) {
        if (owner == null) throw new RuntimeException("Owner can not be null!");
        if (owner.getId() != null && findById(owner.getId()) != null)
            throw new RuntimeException("Owner already exists!");

        owner.setId(getNextId());
        owner.getPets().forEach(pet -> {
            if (pet.getId() == null) {
                Pet save = petService.save(pet);
                pet.setId(save.getId());
            }
        });
        return super.save(owner);
    }

    @Override
    public void delete(final Owner owner) {
        if (owner == null) throw new RuntimeException("Owner can not be null!");
        if (owner.getId() == null) throw new RuntimeException("Owner id is required!");
        deleteById(owner.getId());
    }

    @Override
    public void deleteById(final Long ownerId) {
        Owner owner = findById(ownerId);
        if (owner == null) throw new RuntimeException("Owner id is not known!");
        owner.getPets().forEach(pet -> pet.setOwner(null));
        super.delete(owner);
    }
}
