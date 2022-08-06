package cinema.shop.service.impl;

import cinema.shop.dao.RoleDao;
import cinema.shop.model.Role;
import cinema.shop.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role getByName(String roleName) {
        return roleDao.getByName(roleName);
    }

    @Override
    public Role add(Role roleName) {
        return roleDao.add(roleName);
    }
}
