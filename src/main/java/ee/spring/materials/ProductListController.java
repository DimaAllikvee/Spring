package ee.spring.materials;

import ee.spring.materials.models.Product;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@RestController
public class ProductListController {

    private List<Product> products = new ArrayList<>();

    public ProductListController() {
        products.add(new Product(123, "Cola", 12.3, true));
        products.add(new Product(124, "Fanta", 13.3, true));
        products.add(new Product(125, "Sprite", 14.3, true));
    }


    @GetMapping("products")
    public List<Product> getAllProducts() {
        return products;
    }


    @GetMapping("remove-product/{index}")
    public List<Product> removeProduct(@PathVariable int index) {
        products.remove(index);
        return products;
    }

    @GetMapping("add-product/{id}/{name}/{price}/{active}")
    public List<Product> addProduct(
            @PathVariable int id,
            @PathVariable String name,
            @PathVariable double price,
            @PathVariable boolean active
    ) {
        products.add(new Product(id, name, price, active));
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


