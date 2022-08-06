package cinema.shop.dao.impl;

import cinema.shop.dao.AbstractDao;
import cinema.shop.dao.RoleDao;
import cinema.shop.exception.DataProcessingException;
import cinema.shop.model.Role;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Role getByName(String roleName) {
        try (Session session = factory.openSession()) {
            Query<Role> query =
                    session.createQuery("FROM Role WHERE roleName = :roleName", Role.class);
            query.setParameter("roleName", Role.RoleName.valueOf(roleName));
            return query.getSingleResult();
        } catch (Exception e) {
            throw new DataProcessingException("Role " + roleName + " not found", e);
        }
    }
}
