package com.example.spring1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    ArrayList<Product> products=new ArrayList<>();
    public ProductController(){
        products.add(new Product(1,"Coca",2000));
        products.add(new Product(2,"Fanta",10));
        products.add(new Product(3,"Pesi",30));
    }
    // get all product
    @GetMapping("/products")
    public ResponseEntity<?> getAllProduct(){
        return ResponseEntity.ok(new ProductResponse<ArrayList<Product>>(
                LocalDateTime.now(),
                200,
                "Sucessfully get product",
                products
        ));
    }
    @PostMapping("/products")
    public Product insertProduct(@RequestBody Product product){
        products.add(product);
        return  product;
    }
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable("id") Integer proId){
        return products.stream().
                filter((product)->product.getId().equals(proId)).
                findFirst().
                orElse(null);
//        for(Product product:products){
//            if(product.getId().equals())
//        }
    }
    @GetMapping("/products/name")
    public Product findProductByName(@RequestParam String name){
        return products.stream().filter(product -> product.getName().equalsIgnoreCase(name)).
                findFirst().
                orElse(null);
    }
}
