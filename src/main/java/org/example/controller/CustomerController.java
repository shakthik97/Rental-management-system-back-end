package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Customer;
import org.example.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/get-all")
    public List getAllCustomers(){
       return service.getAllSavedCustomers();
    }

    @GetMapping("/find-by-id/{id}")
    public Customer getCustomerById(@PathVariable Long id){
      return service.findCustomerById(id);
    }


    @DeleteMapping("/delete-customer/{id}")
    public void deleteCustomerById(@PathVariable Long id){
        service.deleteCustomerById(id);
    }


}
