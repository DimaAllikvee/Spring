package ee.spring.materials;


import ee.spring.materials.models.Product;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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


