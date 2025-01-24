package ee.spring.materials.Controllers;

import ee.spring.materials.models.Product;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
public class ProductListController {

    private List<Product> products = new ArrayList<>();

    public ProductListController() {
        products.add(new Product(1, "Cola", 18.3, true));
        products.add(new Product(2, "Fanta", 13.3, true));
        products.add(new Product(3, "Sprite", 14.3, true));
    }

    @GetMapping("products")
    public List<Product> getAllProducts() {
        return products;
    }

    @DeleteMapping("remove-product/{index}")
    public List<Product> removeProduct(@PathVariable int index) {
        if (index >= 0 && index < products.size()) {
            products.remove(index);
        }
        return products;
    }

    @PostMapping("add-product")
    public List<Product> addProduct(@RequestBody Product product) {
        products.add(product);
        return products;
    }

    @GetMapping("highest-price-product")
    public Product getHighestPriceProduct() {
        Product highestPriceProduct = products.get(0);
        for (Product product : products) {
            if (product.getPrice() > highestPriceProduct.getPrice()) {
                highestPriceProduct = product;
            }
        }
        return highestPriceProduct;
    }
}
