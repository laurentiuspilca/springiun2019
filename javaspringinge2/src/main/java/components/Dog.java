package components;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Dog {

    public void sayHam() {
        System.out.println("Ham ham");
    }
}
