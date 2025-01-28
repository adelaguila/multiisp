package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.Sede;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.ISedeRepo;
import pe.datasys.multiisp.service.ISedeService;

@Service
@RequiredArgsConstructor
public class SedeServiceImpl extends CRUDImpl<Sede, Integer> implements ISedeService {

    private final ISedeRepo repo;

    @Override
    protected IGenericRepo<Sede, Integer> getRepo() {
        return repo;
    }

    @Override
    public Sede findByRuc(String ruc) {
        return repo.findByRuc(ruc);
    }
}
