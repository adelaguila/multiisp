package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.OrdenAsignacion;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.IOrdenAsignacionRepo;
import pe.datasys.multiisp.service.IOrdenAsignacionService;

@Service
@RequiredArgsConstructor
public class OrdenAsignacionServiceImpl extends CRUDImpl<OrdenAsignacion, Long> implements IOrdenAsignacionService {

    private final IOrdenAsignacionRepo repo;

    @Override
    protected IGenericRepo<OrdenAsignacion, Long> getRepo() {
        return repo;
    }

    
}
