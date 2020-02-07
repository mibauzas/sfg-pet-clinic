package com.mibauzas.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import com.mibauzas.sfgpetclinic.model.Pet;
import com.mibauzas.sfgpetclinic.repositories.PetRepository;
import com.mibauzas.sfgpetclinic.services.PetService;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * PetSDJpaService
 */
@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService {

    private final PetRepository petRepository;

    public PetSDJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        petRepository.deleteById(id);

    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long id) {
        return petRepository.findById(id).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    
    
}