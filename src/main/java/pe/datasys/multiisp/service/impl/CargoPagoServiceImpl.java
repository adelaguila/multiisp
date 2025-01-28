package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.CargoPago;
import pe.datasys.multiisp.repo.ICargoPagoRepo;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.service.ICargoPagoService;

@Service
@RequiredArgsConstructor
public class CargoPagoServiceImpl extends CRUDImpl<CargoPago, Long> implements ICargoPagoService {

    private final ICargoPagoRepo repo;

    @Override
    protected IGenericRepo<CargoPago, Long> getRepo() {
        return repo;
    }

    
}
