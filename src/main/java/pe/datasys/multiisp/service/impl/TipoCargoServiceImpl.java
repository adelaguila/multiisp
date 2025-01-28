package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.TipoCargo;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.ITipoCargoRepo;
import pe.datasys.multiisp.service.ITipoCargoService;

@Service
@RequiredArgsConstructor
public class TipoCargoServiceImpl extends CRUDImpl<TipoCargo, Integer> implements ITipoCargoService {

    private final ITipoCargoRepo repo;

    @Override
    protected IGenericRepo<TipoCargo, Integer> getRepo() {
        return repo;
    }
    
}
