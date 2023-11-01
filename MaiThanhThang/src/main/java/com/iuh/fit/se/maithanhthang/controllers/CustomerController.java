package com.iuh.fit.se.maithanhthang.controllers;
import com.iuh.fit.se.maithanhthang.models.Customer;
import com.iuh.fit.se.maithanhthang.repositories.CustomerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/list")
    public String customerList(Model model) {
        Iterable<Customer> customers = customerRepository.findAll();
        model.addAttribute("customerList", customers);
        return "list";
    }
}

