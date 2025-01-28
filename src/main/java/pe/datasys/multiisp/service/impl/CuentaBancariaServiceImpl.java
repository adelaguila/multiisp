package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.CuentaBancaria;
import pe.datasys.multiisp.repo.ICuentaBancariaRepo;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.service.ICuentaBancariaService;

@Service
@RequiredArgsConstructor
public class CuentaBancariaServiceImpl extends CRUDImpl<CuentaBancaria, String> implements ICuentaBancariaService {

    private final ICuentaBancariaRepo repo;

    @Override
    protected IGenericRepo<CuentaBancaria, String> getRepo() {
        return repo;
    }

    
}
