package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.TipoOrden;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.ITipoOrdenRepo;
import pe.datasys.multiisp.service.ITipoOrdenService;

@Service
@RequiredArgsConstructor
public class TipoOrdenServiceImpl extends CRUDImpl<TipoOrden, Integer> implements ITipoOrdenService {

    private final ITipoOrdenRepo repo;

    @Override
    protected IGenericRepo<TipoOrden, Integer> getRepo() {
        return repo;
    }
    
}
