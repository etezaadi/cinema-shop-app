package cinema.shop.service;

import cinema.shop.model.MovieSession;
import cinema.shop.model.ShoppingCart;
import cinema.shop.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
