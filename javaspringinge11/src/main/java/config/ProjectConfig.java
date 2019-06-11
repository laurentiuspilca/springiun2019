package config;

import beans.CatFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public CatFactory catFactory() {
        return new CatFactory();
    }
}
