package cinema.shop.service;

import cinema.shop.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
