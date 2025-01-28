package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.Orden;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.IOrdenRepo;
import pe.datasys.multiisp.service.IOrdenService;

@Service
@RequiredArgsConstructor
public class OrdenServiceImpl extends CRUDImpl<Orden, Long> implements IOrdenService {

    private final IOrdenRepo repo;

    @Override
    protected IGenericRepo<Orden, Long> getRepo() {
        return repo;
    }

    
}
