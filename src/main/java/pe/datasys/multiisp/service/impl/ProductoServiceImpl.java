package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.Producto;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.IProductoRepo;
import pe.datasys.multiisp.service.IProductoService;

@Service
@RequiredArgsConstructor
public class ProductoServiceImpl extends CRUDImpl<Producto, Integer> implements IProductoService {

    private final IProductoRepo repo;

    @Override
    protected IGenericRepo<Producto, Integer> getRepo() {
        return repo;
    }
    
}
