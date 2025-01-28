package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.Liquidacion;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.ILiquidacionRepo;
import pe.datasys.multiisp.service.ILiquidacionService;

@Service
@RequiredArgsConstructor
public class LiquidacionServiceImpl extends CRUDImpl<Liquidacion, Integer> implements ILiquidacionService {

    private final ILiquidacionRepo repo;

    @Override
    protected IGenericRepo<Liquidacion, Integer> getRepo() {
        return repo;
    }

    
}
