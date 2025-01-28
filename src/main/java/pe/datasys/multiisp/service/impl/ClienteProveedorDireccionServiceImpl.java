package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.ClienteProveedorDireccion;
import pe.datasys.multiisp.repo.IClienteProveedorDireccionRepo;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.service.IClienteProveedorDireccionService;

@Service
@RequiredArgsConstructor
public class ClienteProveedorDireccionServiceImpl extends CRUDImpl<ClienteProveedorDireccion, Long> implements IClienteProveedorDireccionService {

    private final IClienteProveedorDireccionRepo repo;

    @Override
    protected IGenericRepo<ClienteProveedorDireccion, Long> getRepo() {
        return repo;
    }

    
}
