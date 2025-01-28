package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.Comprobante;
import pe.datasys.multiisp.repo.IComprobanteRepo;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.service.IComprobanteService;

@Service
@RequiredArgsConstructor
public class ComprobanteServiceImpl extends CRUDImpl<Comprobante, Integer> implements IComprobanteService {

    private final IComprobanteRepo repo;

    @Override
    protected IGenericRepo<Comprobante, Integer> getRepo() {
        return repo;
    }

    
}
