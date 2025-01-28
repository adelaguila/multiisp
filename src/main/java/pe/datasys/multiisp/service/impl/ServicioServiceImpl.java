package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.Servicio;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.IServicioRepo;
import pe.datasys.multiisp.service.IServicioService;

@Service
@RequiredArgsConstructor
public class ServicioServiceImpl extends CRUDImpl<Servicio, Integer> implements IServicioService {

    private final IServicioRepo repo;

    @Override
    protected IGenericRepo<Servicio, Integer> getRepo() {
        return repo;
    }
    
}
