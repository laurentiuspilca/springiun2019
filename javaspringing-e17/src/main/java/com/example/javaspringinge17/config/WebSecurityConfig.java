package com.example.javaspringinge17.config;

import com.example.javaspringinge17.security.MyPasswordEncoder;
import com.example.javaspringinge17.security.UserSecurityService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebSecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new MyPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        return new UserSecurityService();
    }
}
