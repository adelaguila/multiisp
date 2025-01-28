package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.Almacen;
import pe.datasys.multiisp.repo.IAlmacenRepo;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.service.IAlmacenService;

@Service
@RequiredArgsConstructor
public class AlmacenServiceImpl extends CRUDImpl<Almacen, Integer> implements IAlmacenService {

    private final IAlmacenRepo repo;

    @Override
    protected IGenericRepo<Almacen, Integer> getRepo() {
        return repo;
    }

    
}
