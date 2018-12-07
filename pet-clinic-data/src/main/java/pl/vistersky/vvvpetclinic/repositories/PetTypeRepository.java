package pl.vistersky.vvvpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.vistersky.vvvpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
