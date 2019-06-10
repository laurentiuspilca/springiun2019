package main;

import beans.Dog;
import beans.Owner;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            Owner o = context.getBean(Owner.class);

            Dog d = o.getDog();

            System.out.println(d);

            Dog d2 = context.getBean(Dog.class);

            System.out.println(d2);
        }
    }
}
