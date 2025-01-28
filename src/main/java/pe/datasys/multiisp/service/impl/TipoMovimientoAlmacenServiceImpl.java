package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.TipoMovimientoAlmacen;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.ITipoMovimientoAlmacenRepo;
import pe.datasys.multiisp.service.ITipoMovimientoAlmacenService;

@Service
@RequiredArgsConstructor
public class TipoMovimientoAlmacenServiceImpl extends CRUDImpl<TipoMovimientoAlmacen, Integer> implements ITipoMovimientoAlmacenService {

    private final ITipoMovimientoAlmacenRepo repo;

    @Override
    protected IGenericRepo<TipoMovimientoAlmacen, Integer> getRepo() {
        return repo;
    }
    
}
