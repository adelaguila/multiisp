package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.ResetMail;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.IResetMailRepo;
import pe.datasys.multiisp.service.IResetMailService;

@Service
@RequiredArgsConstructor
public class ResetMailServiceImpl extends CRUDImpl<ResetMail, Integer> implements IResetMailService {

    private final IResetMailRepo repo;

    @Override
    protected IGenericRepo<ResetMail, Integer> getRepo() {
        return repo;
    }
    
}
