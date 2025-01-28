package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.Plan;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.IPlanRepo;
import pe.datasys.multiisp.service.IPlanService;

@Service
@RequiredArgsConstructor
public class PlanServiceImpl extends CRUDImpl<Plan, Integer> implements IPlanService {

    private final IPlanRepo repo;

    @Override
    protected IGenericRepo<Plan, Integer> getRepo() {
        return repo;
    }

}
