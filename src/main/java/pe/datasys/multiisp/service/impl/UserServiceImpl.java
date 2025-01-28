package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.User;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.IUserRepo;
import pe.datasys.multiisp.service.IUserService;

@Service
@RequiredArgsConstructor
public class UserServiceImpl extends CRUDImpl<User, Integer> implements IUserService {

    private final IUserRepo repo;

    @Override
    protected IGenericRepo<User, Integer> getRepo() {
        return repo;
    }
    
}
