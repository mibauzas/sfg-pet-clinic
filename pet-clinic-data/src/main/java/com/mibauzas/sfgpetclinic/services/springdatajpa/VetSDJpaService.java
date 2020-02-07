package com.mibauzas.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import com.mibauzas.sfgpetclinic.model.Vet;
import com.mibauzas.sfgpetclinic.repositories.VetRepository;
import com.mibauzas.sfgpetclinic.services.VetService;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * VetSDJpaService
 */
@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

    private final VetRepository vetRepository;

    public VetSDJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        vetRepository.deleteById(id);

    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long id) {
        return vetRepository.findById(id).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    
    
}