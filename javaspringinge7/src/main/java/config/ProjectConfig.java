package config;

import beans.Cat;
import beans.Owner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProjectConfig {

    @Bean
    //@Scope("prototype")
    @Lazy
    public Cat cat1() {
        return new Cat();
    }

    @Bean
    public Owner owner() {
        return new Owner();
    }
}
