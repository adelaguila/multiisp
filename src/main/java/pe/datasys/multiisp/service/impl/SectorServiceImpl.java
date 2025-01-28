package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.Sector;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.ISectorRepo;
import pe.datasys.multiisp.service.ISectorService;

@Service
@RequiredArgsConstructor
public class SectorServiceImpl extends CRUDImpl<Sector, Integer> implements ISectorService {

    private final ISectorRepo repo;

    @Override
    protected IGenericRepo<Sector, Integer> getRepo() {
        return repo;
    }
    
}
