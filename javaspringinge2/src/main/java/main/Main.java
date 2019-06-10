package main;

import beans.Cat;
import components.Dog;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            // by type sau by name
//            Cat c1 = context.getBean("cat1", Cat.class);
//            c1.sayMeow();

            Dog dog = context.getBean(Dog.class);
            dog.sayHam();
        }
    }
}
