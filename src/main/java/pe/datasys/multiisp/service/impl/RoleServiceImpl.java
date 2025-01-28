package pe.datasys.multiisp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.datasys.multiisp.model.Role;
import pe.datasys.multiisp.repo.IGenericRepo;
import pe.datasys.multiisp.repo.IRoleRepo;
import pe.datasys.multiisp.service.IRoleService;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl extends CRUDImpl<Role, Integer> implements IRoleService {

    private final IRoleRepo repo;

    @Override
    protected IGenericRepo<Role, Integer> getRepo() {
        return repo;
    }
    
}
