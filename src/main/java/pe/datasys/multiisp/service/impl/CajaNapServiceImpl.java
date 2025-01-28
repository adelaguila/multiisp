package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.CajaNap;
import pe.datasys.multiisp.repo.ICajaNapRepo;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.service.ICajaNapService;

@Service
@RequiredArgsConstructor
public class CajaNapServiceImpl extends CRUDImpl<CajaNap, Integer> implements ICajaNapService {

    private final ICajaNapRepo repo;

    @Override
    protected IGenericRepo<CajaNap, Integer> getRepo() {
        return repo;
    }

    
}
