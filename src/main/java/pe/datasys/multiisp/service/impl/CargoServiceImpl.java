package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.Cargo;
import pe.datasys.multiisp.repo.ICargoRepo;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.service.ICargoService;

@Service
@RequiredArgsConstructor
public class CargoServiceImpl extends CRUDImpl<Cargo, Long> implements ICargoService {

    private final ICargoRepo repo;

    @Override
    protected IGenericRepo<Cargo, Long> getRepo() {
        return repo;
    }

    
}
