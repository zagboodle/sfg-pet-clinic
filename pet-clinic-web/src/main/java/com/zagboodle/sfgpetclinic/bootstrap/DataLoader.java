package com.zagboodle.sfgpetclinic.bootstrap;

import com.zagboodle.sfgpetclinic.model.Owner;
import com.zagboodle.sfgpetclinic.model.Vet;
import com.zagboodle.sfgpetclinic.services.OwnerService;
import com.zagboodle.sfgpetclinic.services.VetService;
import com.zagboodle.sfgpetclinic.services.map.OwnerServiceMap;
import com.zagboodle.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fionna");
        owner2.setLastName("Glennane");

        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Madeline");
        vet2.setLastName("Westen");

        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
