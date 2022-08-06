package cinema.shop.security;

import cinema.shop.model.User;
import cinema.shop.service.UserService;
import java.util.Optional;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UserService userService;

    public CustomUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
        Optional<User> userByEmail = userService.findByEmail(email);

        UserBuilder userBuilder;
        if (userByEmail.isPresent()) {
            userBuilder = org.springframework.security.core.userdetails.User.withUsername(email);
            userBuilder.password(userByEmail.get().getPassword());
            userBuilder.roles(userByEmail.get().getRoles()
                    .stream()
                    .map(u -> u.getRoleName().name())
                    .toArray(String[]::new));
            return userBuilder.build();
        }
        throw new UsernameNotFoundException("Email " + email + " not found.");
    }
}
