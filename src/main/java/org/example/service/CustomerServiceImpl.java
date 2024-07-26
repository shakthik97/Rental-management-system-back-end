package org.example.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.dto.Customer;
import org.example.entity.CustomerEntity;
import org.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository repository;
    @Autowired
    ObjectMapper mapper;
    @Override
    public void addNewCustomer(Customer customer) {
        CustomerEntity customerEntity = mapper.convertValue(customer, CustomerEntity.class);
        repository.save(customerEntity);
    }
}
