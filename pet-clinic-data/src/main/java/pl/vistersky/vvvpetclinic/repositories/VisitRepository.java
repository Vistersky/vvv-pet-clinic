package pl.vistersky.vvvpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.vistersky.vvvpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
