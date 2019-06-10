package config;

import beans.Dog;
import beans.Owner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Owner owner() {
        Owner o = new Owner();
        o.setDog(dog());
        o.setName("John");
        return o;
    }

    @Bean
    public Dog dog() {
        Dog d = new Dog();
        d.setName("Pit");
        return d;
    }
}
