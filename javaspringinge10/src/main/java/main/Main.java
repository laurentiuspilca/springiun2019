package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.MathService;

public class Main {

    public static void main(String[] args) {
        try (var c = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            MathService s = c.getBean(MathService.class);
            int res = s.add(3, 5);
            System.out.println(res);
        }
    }
}
