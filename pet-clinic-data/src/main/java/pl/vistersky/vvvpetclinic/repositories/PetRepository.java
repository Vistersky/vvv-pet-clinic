package pl.vistersky.vvvpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.vistersky.vvvpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
