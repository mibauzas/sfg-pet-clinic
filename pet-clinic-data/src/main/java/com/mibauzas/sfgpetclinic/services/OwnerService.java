package com.mibauzas.sfgpetclinic.services;

import com.mibauzas.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName (String lastName);

}