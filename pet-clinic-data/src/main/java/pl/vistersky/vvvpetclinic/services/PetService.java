package pl.vistersky.vvvpetclinic.services;

import pl.vistersky.vvvpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
