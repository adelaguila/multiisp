package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.InventarioTecnico;
import pe.datasys.multiisp.repo.IInventarioTecnicoRepo;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.service.IInventarioTecnicoService;

@Service
@RequiredArgsConstructor
public class InventarioTecnicoServiceImpl extends CRUDImpl<InventarioTecnico, Long> implements IInventarioTecnicoService {

    private final IInventarioTecnicoRepo repo;

    @Override
    protected IGenericRepo<InventarioTecnico, Long> getRepo() {
        return repo;
    }

    
}
