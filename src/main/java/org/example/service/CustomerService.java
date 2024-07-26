package org.example.service;

import org.example.dto.Customer;

import java.util.List;

public interface CustomerService {
    void addNewCustomer(Customer customer);

    List getAllSavedCustomers();

    Customer findCustomerById(Long id);

    void deleteCustomerById(Long id);
}
