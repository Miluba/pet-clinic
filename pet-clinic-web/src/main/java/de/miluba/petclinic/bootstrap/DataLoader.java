package de.miluba.petclinic.bootstrap;

import de.miluba.petclinic.model.*;
import de.miluba.petclinic.services.OwnerService;
import de.miluba.petclinic.services.PetService;
import de.miluba.petclinic.services.VetService;
import de.miluba.petclinic.services.VisitService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetService petService;
    private final VisitService visitService;


    public DataLoader(final OwnerService ownerService, final VetService vetService, final PetService petService,
                      VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petService = petService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) {
        int size = petService.findAll().size();
        if (size == 0) loadData();
    }

    private void loadData() {
        Owner owner1 = new Owner();
        Name michael = new Name("Michael", "Lukas", "Bauer");
        Address address = new Address("67", "Feldbergstraße", "68163", "Mannheim",
                "Germany");
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
        vet.addSpeciality(new Speciality("radiology", "radiology master"));
        vet.addSpeciality(new Speciality("surgery", "surgery bachelor"));
        vetService.save(vet);

        System.out.println("Loaded Vets ...");

        Pet dog = new Pet();
        dog.setSpecies(Species.DOG);
        dog.setName("Bello");
        dog.setOwner(owner1);
        owner1.addPet(dog);
        dog.setBirthDate(LocalDate.now());
        petService.save(dog);

        Pet cat = new Pet();
        dog.setSpecies(Species.CAT);
        dog.setName("Mietzi");
        dog.setOwner(owner1);
        owner1.addPet(cat);
        dog.setBirthDate(LocalDate.now());
        petService.save(cat);

        Pet fish = new Pet();
        dog.setSpecies(Species.FISH);
        dog.setName("Nemo");
        dog.setOwner(owner2);
        owner2.addPet(fish);
        dog.setBirthDate(LocalDate.now());
        petService.save(fish);

        System.out.println("Loaded Pets ...");

        Visit visit1 = new Visit();
        visit1.setDate(LocalDate.now());
        visit1.setDescription("Head ake");
        visit1.setPet(dog);
        visitService.save(visit1);

        Visit visit2 = new Visit();
        visit2.setDate(LocalDate.now());
        visit2.setDescription("Knee pain");
        visit2.setPet(cat);
        visitService.save(visit2);

        Visit visit3 = new Visit();
        visit3.setDate(LocalDate.now());
        visit3.setDescription("Fin pain");
        visit3.setPet(fish);
        visitService.save(visit3);

        System.out.println("Loaded Visits ...");

    }
}
