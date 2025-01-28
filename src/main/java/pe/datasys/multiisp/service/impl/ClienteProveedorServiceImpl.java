package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.ClienteProveedor;
import pe.datasys.multiisp.repo.IClienteProveedorRepo;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.service.IClienteProveedorService;

@Service
@RequiredArgsConstructor
public class ClienteProveedorServiceImpl extends CRUDImpl<ClienteProveedor, Long> implements IClienteProveedorService {

    private final IClienteProveedorRepo repo;

    @Override
    protected IGenericRepo<ClienteProveedor, Long> getRepo() {
        return repo;
    }

    
}
