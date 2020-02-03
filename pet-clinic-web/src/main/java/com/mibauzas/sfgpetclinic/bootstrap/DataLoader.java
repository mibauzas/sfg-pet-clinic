package com.mibauzas.sfgpetclinic.bootstrap;

import java.time.LocalDate;

import com.mibauzas.sfgpetclinic.model.Owner;
import com.mibauzas.sfgpetclinic.model.Pet;
import com.mibauzas.sfgpetclinic.model.PetType;
import com.mibauzas.sfgpetclinic.model.Vet;
import com.mibauzas.sfgpetclinic.services.OwnerService;
import com.mibauzas.sfgpetclinic.services.PetTypeService;
import com.mibauzas.sfgpetclinic.services.VetService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * DataLoader
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    private final VetService vetService;

    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService){
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    
    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);
        
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Main Street");
        owner1.setCity("Miami");
        owner1.setTelephone("123123123");
        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glennane");
        owner2.setAddress("123 Main Street");
        owner2.setCity("Miami");
        owner2.setTelephone("123123123");
        Pet fionasCat = new Pet();
        fionasCat.setPetType(savedCatPetType);
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setName("Mishi");
        owner2.getPets().add(fionasCat);

        ownerService.save(owner2);

        System.out.println("Loading owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Lea");
        vet2.setLastName("Wayne");

        vetService.save(vet2);

        System.out.println("Loading vets....");
    }
    
    
}