package com.timilehinvincent.springbootpetclinic.services;


import com.timilehinvincent.springbootpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}