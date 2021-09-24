package com.timilehinvincent.springbootpetclinic.services;

import com.timilehinvincent.springbootpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
