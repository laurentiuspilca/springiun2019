package config;

import beans.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "components")
public class ProjectConfig {

    @Bean
    public Cat cat1() {
        return new Cat();
    }

    @Bean
    @Primary
    public Cat cat2() {
        return new Cat();
    }
}
