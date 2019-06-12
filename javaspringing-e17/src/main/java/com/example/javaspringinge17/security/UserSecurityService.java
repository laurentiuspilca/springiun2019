package com.example.javaspringinge17.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserSecurityService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("bill".equals(username)) {
            return new User();
        } else {
            throw new UsernameNotFoundException(":(");
        }
    }
}
