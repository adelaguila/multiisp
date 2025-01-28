package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.SedePlan;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.ISedePlanRepo;
import pe.datasys.multiisp.service.ISedePlanService;

@Service
@RequiredArgsConstructor
public class SedePlanServiceImpl extends CRUDImpl<SedePlan, Integer> implements ISedePlanService {

    private final ISedePlanRepo repo;

    @Override
    protected IGenericRepo<SedePlan, Integer> getRepo() {
        return repo;
    }
    
}
