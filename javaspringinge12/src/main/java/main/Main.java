package main;

import config.ProjectConfig;
import model.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.ProductService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        try (var c = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            ProductService productService = c.getBean(ProductService.class);
            productService.addTwoProducts();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
