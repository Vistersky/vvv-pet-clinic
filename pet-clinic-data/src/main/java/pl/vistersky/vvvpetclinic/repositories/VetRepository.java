package pl.vistersky.vvvpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.vistersky.vvvpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
