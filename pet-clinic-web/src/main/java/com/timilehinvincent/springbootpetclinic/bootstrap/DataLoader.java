package com.timilehinvincent.springbootpetclinic.bootstrap;

import com.timalex.sfgclinic.model.Owner;
import com.timalex.sfgclinic.model.Vet;
import com.timalex.sfgclinic.services.OwnerService;
import com.timalex.sfgclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private static OwnerService ownerService;
    private static VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Timmy");
        owner1.setLastName("Gimmicks");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Jared");
        owner2.setLastName("Gis");

        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setId(3L);
        owner3.setFirstName("Fred");
        owner3.setLastName("Los");

        ownerService.save(owner3);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Timmy");
        vet1.setLastName("Gimmicks");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Timmy");
        vet2.setLastName("Gimmicks");

        vetService.save(vet2);

        Vet vet3 = new Vet();
        vet3.setId(3L);
        vet3.setFirstName("Grise");
        vet3.setLastName("Muls");

        vetService.save(vet3);

        System.out.println("Loaded Vets...");
    }
}
