package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.TipoPago;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.ITipoPagoRepo;
import pe.datasys.multiisp.service.ITipoPagoService;

@Service
@RequiredArgsConstructor
public class TipoPagoServiceImpl extends CRUDImpl<TipoPago, Integer> implements ITipoPagoService {

    private final ITipoPagoRepo repo;

    @Override
    protected IGenericRepo<TipoPago, Integer> getRepo() {
        return repo;
    }
    
}
