package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.SunatTipoDocumentoIdentidad;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.ISunatTipoDocumentoIdentidadRepo;
import pe.datasys.multiisp.service.ISunatTipoDocumentoIdentidadService;

@Service
@RequiredArgsConstructor
public class SunatTipoDocumentoIdentidadServiceImpl extends CRUDImpl<SunatTipoDocumentoIdentidad, String> implements ISunatTipoDocumentoIdentidadService {

    private final ISunatTipoDocumentoIdentidadRepo repo;

    @Override
    protected IGenericRepo<SunatTipoDocumentoIdentidad, String> getRepo() {
        return repo;
    }
    
}
