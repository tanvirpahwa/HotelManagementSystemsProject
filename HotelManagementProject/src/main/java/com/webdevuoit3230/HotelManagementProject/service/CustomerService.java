package com.webdevuoit3230.HotelManagementProject.service;

import com.webdevuoit3230.HotelManagementProject.model.Customer;
import com.webdevuoit3230.HotelManagementProject.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public void addCustomer(Customer customer) {
        if (customer != null) {
            customerRepository.save(customer);
        } else {
            // Handle the case where customer is null
            throw new IllegalArgumentException("Customer cannot be null");
        }
    }

    // Add similar methods for update and delete operations
}
