package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.PlanServicio;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.IPlanServicioRepo;
import pe.datasys.multiisp.service.IPlanServicioService;

@Service
@RequiredArgsConstructor
public class PlanServicioServiceImpl extends CRUDImpl<PlanServicio, Integer> implements IPlanServicioService {

    private final IPlanServicioRepo repo;

    @Override
    protected IGenericRepo<PlanServicio, Integer> getRepo() {
        return repo;
    }
    
}
