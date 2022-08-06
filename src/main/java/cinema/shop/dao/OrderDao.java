package cinema.shop.dao;

import cinema.shop.model.Order;
import cinema.shop.model.User;
import java.util.List;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
