package pl.vistersky.vvvpetclinic.services;

import pl.vistersky.vvvpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
