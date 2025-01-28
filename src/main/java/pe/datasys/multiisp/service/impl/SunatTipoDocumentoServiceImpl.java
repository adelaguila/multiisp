package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.SunatTipoDocumento;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.ISunatTipoDocumentoRepo;
import pe.datasys.multiisp.service.ISunatTipoDocumentoService;

@Service
@RequiredArgsConstructor
public class SunatTipoDocumentoServiceImpl extends CRUDImpl<SunatTipoDocumento, String> implements ISunatTipoDocumentoService {

    private final ISunatTipoDocumentoRepo repo;

    @Override
    protected IGenericRepo<SunatTipoDocumento, String> getRepo() {
        return repo;
    }
    
}
