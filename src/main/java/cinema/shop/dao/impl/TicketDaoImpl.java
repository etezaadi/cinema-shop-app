package cinema.shop.dao.impl;

import cinema.shop.dao.AbstractDao;
import cinema.shop.dao.TicketDao;
import cinema.shop.model.Ticket;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory factory) {
        super(factory, Ticket.class);
    }
}
