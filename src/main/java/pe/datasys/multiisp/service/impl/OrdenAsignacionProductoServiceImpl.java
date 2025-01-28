package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.OrdenAsignacionProducto;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.IOrdenAsignacionProductoRepo;
import pe.datasys.multiisp.service.IOrdenAsignacionProductoService;

@Service
@RequiredArgsConstructor
public class OrdenAsignacionProductoServiceImpl extends CRUDImpl<OrdenAsignacionProducto, Long> implements IOrdenAsignacionProductoService {

    private final IOrdenAsignacionProductoRepo repo;

    @Override
    protected IGenericRepo<OrdenAsignacionProducto, Long> getRepo() {
        return repo;
    }

    
}
