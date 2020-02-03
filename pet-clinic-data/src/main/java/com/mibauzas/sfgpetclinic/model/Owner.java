package com.mibauzas.sfgpetclinic.model;

import java.util.Set;

/**
 * created by mbs on 01/24/20
 */
public class Owner extends Person{

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    
    
}