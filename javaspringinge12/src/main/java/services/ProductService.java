package services;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addProduct(Product p) {
        productRepository.addProduct(p.getName());
    }

    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    @Transactional
    public void addTenProducts() throws Exception {
        for (int i = 1; i <= 10; i++) {
            productRepository.addProduct("Product " + i);
            //if (i == 5) throw new RuntimeException(":(");
        }
    }

    @Transactional(isolation = Isolation.READ_UNCOMMITTED) // Ta
    public void addTwoProducts() {
        productRepository.addProduct("PRODUCT NO EXCEPTION"); // Ta

        try {
            productRepository.addProductException("PRODUCT EXCEPTION");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
