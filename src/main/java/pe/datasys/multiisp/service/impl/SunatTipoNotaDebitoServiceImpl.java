package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.SunatTipoNotaDebito;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.ISunatTipoNotaDebitoRepo;
import pe.datasys.multiisp.service.ISunatTipoNotaDebitoService;

@Service
@RequiredArgsConstructor
public class SunatTipoNotaDebitoServiceImpl extends CRUDImpl<SunatTipoNotaDebito, String> implements ISunatTipoNotaDebitoService {

    private final ISunatTipoNotaDebitoRepo repo;

    @Override
    protected IGenericRepo<SunatTipoNotaDebito, String> getRepo() {
        return repo;
    }
    
}
