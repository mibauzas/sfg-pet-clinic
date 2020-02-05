package com.mibauzas.sfgpetclinic.repositories;

import com.mibauzas.sfgpetclinic.model.Pet;

import org.springframework.data.repository.CrudRepository;

/**
 * PetRepository
 */
public interface PetRepository extends CrudRepository<Pet, Long>{

    
}