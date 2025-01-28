package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.AlmacenMovimiento;
import pe.datasys.multiisp.repo.IAlmacenMovimientoRepo;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.service.IAlmacenMovimientoService;

@Service
@RequiredArgsConstructor
public class AlmacenMovimientoServiceImpl extends CRUDImpl<AlmacenMovimiento, Long> implements IAlmacenMovimientoService {

    private final IAlmacenMovimientoRepo repo;

    @Override
    protected IGenericRepo<AlmacenMovimiento, Long> getRepo() {
        return repo;
    }

    
}
