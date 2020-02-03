package com.mibauzas.sfgpetclinic.model;

import java.util.Set;

/**
 * created by mbs on 01/24/20
 */
public class Vet extends Person{

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }

}