package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.Via;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.IViaRepo;
import pe.datasys.multiisp.service.IViaService;

@Service
@RequiredArgsConstructor
public class ViaServiceImpl extends CRUDImpl<Via, Integer> implements IViaService {

    private final IViaRepo repo;

    @Override
    protected IGenericRepo<Via, Integer> getRepo() {
        return repo;
    }
    
}
