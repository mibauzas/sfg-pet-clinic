package com.mibauzas.sfgpetclinic.services.map;

import java.util.Set;

import com.mibauzas.sfgpetclinic.model.Owner;
import com.mibauzas.sfgpetclinic.services.OwnerService;

import org.springframework.stereotype.Service;

/**
 * OwnerMapService
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

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
        return super.save(object);
    }

}