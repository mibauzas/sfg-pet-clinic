package com.mibauzas.sfgpetclinic.services.map;

import java.util.Set;

import com.mibauzas.sfgpetclinic.model.Owner;
import com.mibauzas.sfgpetclinic.model.Pet;
import com.mibauzas.sfgpetclinic.services.OwnerService;
import com.mibauzas.sfgpetclinic.services.PetService;
import com.mibauzas.sfgpetclinic.services.PetTypeService;

import org.springframework.stereotype.Service;

/**
 * OwnerMapService
 */
@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName){
        return null;
    }

    @Override
    public Owner save(Owner object) {
        if (object != null){
            if (object.getPets() != null){
                object.getPets().forEach(pet -> {
                    if (pet.getPetType()!=null){
                        if (pet.getPetType().getId() == null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    }else{
                        throw new RuntimeException("Pet type is required");
                    }

                    if (pet.getId() == null){
                        Pet savedPed = petService.save(pet);
                        pet.setId(savedPed.getId());
                    }
                });
            }
            return super.save(object);
        } else {
            return null;
        }
        
    }

}