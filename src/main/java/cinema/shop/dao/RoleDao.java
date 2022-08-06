package cinema.shop.dao;

import cinema.shop.model.Role;

public interface RoleDao {
    Role add(Role role);

    Role getByName(String roleName);
}
