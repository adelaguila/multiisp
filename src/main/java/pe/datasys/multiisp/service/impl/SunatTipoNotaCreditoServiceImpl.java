package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.SunatTipoNotaCredito;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.ISunatTipoNotaCreditoRepo;
import pe.datasys.multiisp.service.ISunatTipoNotaCreditoService;

@Service
@RequiredArgsConstructor
public class SunatTipoNotaCreditoServiceImpl extends CRUDImpl<SunatTipoNotaCredito, String> implements ISunatTipoNotaCreditoService {

    private final ISunatTipoNotaCreditoRepo repo;

    @Override
    protected IGenericRepo<SunatTipoNotaCredito, String> getRepo() {
        return repo;
    }
    
}
