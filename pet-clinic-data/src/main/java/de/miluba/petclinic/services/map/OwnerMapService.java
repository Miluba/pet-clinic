package de.miluba.petclinic.services.map;

import de.miluba.petclinic.model.Owner;
import de.miluba.petclinic.model.Pet;
import de.miluba.petclinic.services.OwnerService;
import de.miluba.petclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetService petService;

    public OwnerMapService(PetService petService) {
        this.petService = petService;
    }

    @Override
    public Optional<Owner> findByLastName(String lastName) {
        return Optional.empty();
    }

    @Override
    public Owner save(final Owner owner) {
        if (owner != null) {
            if (owner.getId() == null || !findById(owner.getId()).isPresent()) {
                owner.setId(getNextId());
                owner.getPets().forEach(pet -> {
                    if (pet.getId() == null || !petService.findById(pet.getId()).isPresent()) {
                        Pet save = petService.save(pet);
                        pet.setId(save.getId());
                    }
                });
            }
        } else {
            throw new RuntimeException("Owner can not be null!");
        }
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
        Optional<Owner> optionalOwner = findById(ownerId);
        if (!optionalOwner.isPresent()) throw new RuntimeException("Owner is not known!");
        optionalOwner.get().getPets().forEach(pet -> pet.setOwner(null));
        super.delete(optionalOwner.get());
    }
}
