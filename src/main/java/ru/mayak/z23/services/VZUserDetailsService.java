package ru.mayak.z23.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.mayak.z23.domain.User;
import ru.mayak.z23.repositories.UserRepository;

@Service
public class VZUserDetailsService implements UserDetailsService {
    private static final String USER_NOT_FOUND_ERROR = "User %s not found";

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByLogin(username);
        if (user == null)
            throw new UsernameNotFoundException(String.format(USER_NOT_FOUND_ERROR, username));
        return user;
    }
}
