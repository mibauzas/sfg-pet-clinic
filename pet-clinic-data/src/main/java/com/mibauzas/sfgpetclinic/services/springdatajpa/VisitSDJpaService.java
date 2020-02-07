package com.mibauzas.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import com.mibauzas.sfgpetclinic.model.Visit;
import com.mibauzas.sfgpetclinic.repositories.VisitRepository;
import com.mibauzas.sfgpetclinic.services.VisitService;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * VisitSDJpaService
 */
@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitSDJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        visitRepository.deleteById(id);
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long id) {
        return visitRepository.findById(id).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    
}