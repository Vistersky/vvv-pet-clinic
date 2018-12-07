package pl.vistersky.vvvpetclinic.services.map;

import org.springframework.stereotype.Service;
import pl.vistersky.vvvpetclinic.model.Visit;
import pl.vistersky.vvvpetclinic.services.VisitService;

import java.util.Set;

@Service
public class VisitServiceMap extends AbstractMapService<Visit,Long> implements VisitService {



    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit object) {
        if(object.getPet() == null || object.getPet().getOwner() == null || object.getPet().getId() == null){
            throw new RuntimeException("Invalid Visit");
        }

        return super.save(object);
    }

    @Override
    public void delete(Visit object) {
        delete(object);
    }

    @Override
    public void deleteById(Long id) {
        deleteById(id);
    }
}
