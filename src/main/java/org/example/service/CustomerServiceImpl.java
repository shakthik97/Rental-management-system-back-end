package org.example.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.example.dto.Customer;
import org.example.entity.CustomerEntity;
import org.example.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Override
    public Customer findCustomerById(Long id) {
        Optional<CustomerEntity> byId = repository.findById(id);
        return mapper.convertValue(byId, Customer.class);
    }

    @Override
    public void deleteCustomerById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void updateCustomer(Customer customer) {
        if(repository.existsById(customer.getId())){
            repository.save(mapper.convertValue(customer, CustomerEntity.class));
        }

    }
}
