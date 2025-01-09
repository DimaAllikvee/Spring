package ee.spring.materials;

import ee.spring.materials.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private Product product = new Product(123, "Product", 12.3, true);

    @GetMapping("product")
    public Product getProduct() {
        return product;
    }

    @GetMapping("delete-product")
    public void deleteProduct() {
        product = null;
    }

    @GetMapping("set-price")
    public Product setPrice() {
        if (product != null) {
            product.setPrice(product.getPrice() + 0.2);
        }
        return product;
    }


    @GetMapping("change-product-status")
    public Product toggleProductStatus() {
        if (product != null) {
            product.setActive(!product.isActive());
        }
        return product;
    }

    @GetMapping("set-name/{newName}")
    public Product setName(@PathVariable String newName) {
        if (product != null) {
            product.setName(newName);
        }
        return product;
    }
}


