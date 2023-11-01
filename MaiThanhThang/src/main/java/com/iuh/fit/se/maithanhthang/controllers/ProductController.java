package com.iuh.fit.se.maithanhthang.controllers;
import com.iuh.fit.se.maithanhthang.repositories.ProductRepository;
import com.iuh.fit.se.maithanhthang.models.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/product-list")
    public String productList(Model model) {
        Iterable<Product> products = productRepository.findAll();
        model.addAttribute("products", products);
        return "product-list";
    }
}
