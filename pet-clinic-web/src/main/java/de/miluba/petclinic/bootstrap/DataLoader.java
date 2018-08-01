package de.miluba.petclinic.bootstrap;

import de.miluba.petclinic.model.Owner;
import de.miluba.petclinic.model.Vet;
import de.miluba.petclinic.services.OwnerService;
import de.miluba.petclinic.services.VetService;
import de.miluba.petclinic.services.map.OwnerMapService;
import de.miluba.petclinic.services.map.VetMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    final OwnerService ownerService;
    final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerMapService();
        vetService = new VetMapService();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Bauer");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Christina");
        owner2.setLastName("Halwax");
        ownerService.save(owner2);

        System.out.println("Loaded Owners ...");

        Vet vet = new Vet();
        vet.setFirstName("Peter");
        vet.setLastName("Butz");
        vetService.save(vet);

        System.out.println("Loaded Vets ...");
    }
}
