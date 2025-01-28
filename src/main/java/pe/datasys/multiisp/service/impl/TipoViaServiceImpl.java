package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.TipoVia;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.ITipoViaRepo;
import pe.datasys.multiisp.service.ITipoViaService;

@Service
@RequiredArgsConstructor
public class TipoViaServiceImpl extends CRUDImpl<TipoVia, String> implements ITipoViaService {

    private final ITipoViaRepo repo;

    @Override
    protected IGenericRepo<TipoVia, String> getRepo() {
        return repo;
    }
    
}
