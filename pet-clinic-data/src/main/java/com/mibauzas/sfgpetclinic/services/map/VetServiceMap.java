package com.mibauzas.sfgpetclinic.services.map;

import java.util.Set;

import com.mibauzas.sfgpetclinic.model.Vet;
import com.mibauzas.sfgpetclinic.services.VetService;

import org.springframework.stereotype.Service;

/**
 * VetServiceMap
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    
    
}