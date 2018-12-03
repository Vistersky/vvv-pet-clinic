package pl.vistersky.vvvpetclinic.services;

import pl.vistersky.vvvpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
