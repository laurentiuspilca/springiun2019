package beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Cat {

    @PostConstruct
    public void init() {
        System.out.println("Cat was created");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("B");
    }

    public void sayMeow() {
        System.out.println("Meow!");
    }
}
