package cinema.shop.service;

import cinema.shop.model.Order;
import cinema.shop.model.ShoppingCart;
import cinema.shop.model.User;
import java.util.List;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
