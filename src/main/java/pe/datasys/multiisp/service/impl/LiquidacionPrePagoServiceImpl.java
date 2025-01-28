package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.LiquidacionPrePago;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.ILiquidacionPrePagoRepo;
import pe.datasys.multiisp.service.ILiquidacionPrePagoService;

@Service
@RequiredArgsConstructor
public class LiquidacionPrePagoServiceImpl extends CRUDImpl<LiquidacionPrePago, Long> implements ILiquidacionPrePagoService {

    private final ILiquidacionPrePagoRepo repo;

    @Override
    protected IGenericRepo<LiquidacionPrePago, Long> getRepo() {
        return repo;
    }

    
}
