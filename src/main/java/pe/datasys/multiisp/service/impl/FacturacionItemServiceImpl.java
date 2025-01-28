package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.FacturacionItem;
import pe.datasys.multiisp.repo.IFacturacionItemRepo;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.service.IFacturacionItemService;

@Service
@RequiredArgsConstructor
public class FacturacionItemServiceImpl extends CRUDImpl<FacturacionItem, Long> implements IFacturacionItemService {

    private final IFacturacionItemRepo repo;

    @Override
    protected IGenericRepo<FacturacionItem, Long> getRepo() {
        return repo;
    }

    
}
