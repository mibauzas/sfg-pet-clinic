package com.mibauzas.sfgpetclinic.services;

import java.util.Set;

import com.mibauzas.sfgpetclinic.model.Vet;

public interface VetService {

    Vet findById (Long id);

    Vet save (Vet vet);

    Set<Vet> findAll();
}