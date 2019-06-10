package main;

import beans.Cat;
import beans.Owner;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext c =
                new AnnotationConfigApplicationContext(ProjectConfig.class)) {
//            Cat c1 = c.getBean(Cat.class);
//            Cat c2 = c.getBean(Cat.class);
//
//            System.out.println(c1);
//            System.out.println(c2);

            Owner o = c.getBean(Owner.class);

//            System.out.println(o);
        }
    }
}
