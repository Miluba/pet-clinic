package de.miluba.petclinic.bootstrap;

import de.miluba.petclinic.model.Address;
import de.miluba.petclinic.model.Name;
import de.miluba.petclinic.model.Owner;
import de.miluba.petclinic.model.Vet;
import de.miluba.petclinic.services.OwnerService;
import de.miluba.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader(final OwnerService ownerService, final VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) {
        Owner owner1 = new Owner();
        Name michael = new Name("Michael", "Lukas", "Bauer");
        Address address = new Address("67", "Feldbergstraße", "68163", "Mannheim", "Germany");
        owner1.setName(michael);
        owner1.setAddress(address);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        Name christina = new Name("Christina", "", "Halwax");
        owner2.setName(christina);
        owner2.setAddress(address);
        ownerService.save(owner2);

        System.out.println("Loaded Owners ...");

        Vet vet = new Vet();
        Name peter = new Name("Peter", "", "Butz");
        vet.setName(peter);
        vetService.save(vet);

        System.out.println("Loaded Vets ...");
    }
}
