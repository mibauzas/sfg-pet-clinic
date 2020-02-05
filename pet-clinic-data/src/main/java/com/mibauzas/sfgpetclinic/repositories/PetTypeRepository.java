package com.mibauzas.sfgpetclinic.repositories;

import com.mibauzas.sfgpetclinic.model.PetType;

import org.springframework.data.repository.CrudRepository;

/**
 * PetTypeRepository
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long>{

    
}