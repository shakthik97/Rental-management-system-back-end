package org.example.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.example.dto.Customer;
import org.example.entity.CustomerEntity;
import org.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService{


  private final  CustomerRepository repository;

  private final ObjectMapper mapper;
    @Override
    public void addNewCustomer(Customer customer) {
        CustomerEntity customerEntity = mapper.convertValue(customer, CustomerEntity.class);
        repository.save(customerEntity);
    }

    @Override
    public List getAllSavedCustomers() {
        List<Customer> allCustomersList = new ArrayList<>();

        for (CustomerEntity customerEntity : repository.findAll()) {
            Customer customer = mapper.convertValue(customerEntity, Customer.class);
            allCustomersList.add(customer);
        }
        return allCustomersList;

    }
}
