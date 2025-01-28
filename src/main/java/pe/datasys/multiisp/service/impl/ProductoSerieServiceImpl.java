package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.ProductoSerie;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.IProductoSerieRepo;
import pe.datasys.multiisp.service.IProductoSerieService;

@Service
@RequiredArgsConstructor
public class ProductoSerieServiceImpl extends CRUDImpl<ProductoSerie, String> implements IProductoSerieService {

    private final IProductoSerieRepo repo;

    @Override
    protected IGenericRepo<ProductoSerie, String> getRepo() {
        return repo;
    }

}
