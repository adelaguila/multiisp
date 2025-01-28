package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.Facturacion;
import pe.datasys.multiisp.repo.IFacturacionRepo;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.service.IFacturacionService;

@Service
@RequiredArgsConstructor
public class FacturacionServiceImpl extends CRUDImpl<Facturacion, Long> implements IFacturacionService {

    private final IFacturacionRepo repo;

    @Override
    protected IGenericRepo<Facturacion, Long> getRepo() {
        return repo;
    }

    
}
