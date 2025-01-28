package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.Abonado;
import pe.datasys.multiisp.repo.IAbonadoRepo;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.service.IAbonadoService;

@Service
@RequiredArgsConstructor
public class AbonadoServiceImpl extends CRUDImpl<Abonado, Long> implements IAbonadoService {

    private final IAbonadoRepo repo;

    @Override
    protected IGenericRepo<Abonado, Long> getRepo() {
        return repo;
    }

    
}
