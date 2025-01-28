package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.Moneda;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.IMonedaRepo;
import pe.datasys.multiisp.service.IMonedaService;

@Service
@RequiredArgsConstructor
public class MonedaServiceImpl extends CRUDImpl<Moneda, String> implements IMonedaService {

    private final IMonedaRepo repo;

    @Override
    protected IGenericRepo<Moneda, String> getRepo() {
        return repo;
    }

    
}
