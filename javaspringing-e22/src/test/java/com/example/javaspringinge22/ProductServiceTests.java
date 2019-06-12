package com.example.javaspringinge22;

import com.example.javaspringinge22.entities.Product;
import com.example.javaspringinge22.repositories.ProductRepository;
import com.example.javaspringinge22.services.ProductService;
import com.example.javaspringinge22.services.ScheduledService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTests {

    @Autowired
    private ProductService productService;

    @MockBean
    private ProductRepository productRepository;

    @Test(expected = IllegalArgumentException.class)
    public void assertThatExceptionIsThrownForNegativeN() {
        productService.addNProducts(-1);
    }

    @Test
    public void testThatAddingProductIsCalledNTimes() {
        int n = 3;

        productService.addNProducts(n);

        verify(productRepository, times(n)).addProduct(any());
    }

    @Test
    public void testThatResultIsEmptyWhenNothingIsProvidedFromDB() {

        when(productRepository.findAllProducts())
                .thenReturn(Collections.emptyList());

        List<Product> products =
                productService.findProductsWithGivenWordInName("beer");

        assertTrue(products.isEmpty());
    }

    @Test
    public void testThatResultIsEmptyWhenNoProductContainsTheParam() {
        Product p1 = new Product();
        p1.setName("Chocolate");

        Product p2 = new Product();
        p2.setName("Biscuits");

        List<Product> productsFromDb = Arrays.asList(p1,p2);

        when(productRepository.findAllProducts())
                .thenReturn(productsFromDb);

        List<Product> products =
                productService.findProductsWithGivenWordInName("beer");

        assertTrue(products.isEmpty());
    }

    @Test
    public void testThatResultIsEmptyWhenOneProductContainsTheParam() {
        Product p1 = new Product();
        p1.setName("Chocolate");

        Product p2 = new Product();
        p2.setName("beer");

        List<Product> productsFromDb = Arrays.asList(p1,p2);

        when(productRepository.findAllProducts())
                .thenReturn(productsFromDb);

        List<Product> products =
                productService.findProductsWithGivenWordInName("beer");

        assertEquals(1, products.size());
    }
}

