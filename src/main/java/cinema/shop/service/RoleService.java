package cinema.shop.service;

import cinema.shop.model.Role;

public interface RoleService {
    Role getByName(String roleName);

    Role add(Role roleName);
}
