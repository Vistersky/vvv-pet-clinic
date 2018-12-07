package pl.vistersky.vvvpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.vistersky.vvvpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
