package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Customer;
import org.example.service.CustomerService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequiredArgsConstructor
@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService service;
    @PostMapping("/add")
    public void addCustomer(@RequestBody Customer customer) {
        service.addNewCustomer(customer);
    }


}
