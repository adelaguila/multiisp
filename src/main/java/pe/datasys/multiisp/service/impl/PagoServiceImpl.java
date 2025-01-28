package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.Pago;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.IPagoRepo;
import pe.datasys.multiisp.service.IPagoService;

@Service
@RequiredArgsConstructor
public class PagoServiceImpl extends CRUDImpl<Pago, Long> implements IPagoService {

    private final IPagoRepo repo;

    @Override
    protected IGenericRepo<Pago, Long> getRepo() {
        return repo;
    }

    
}
