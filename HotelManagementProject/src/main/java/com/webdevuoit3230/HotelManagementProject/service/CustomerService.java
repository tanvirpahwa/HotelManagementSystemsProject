/**
 * 
 */
package com.webdevuoit3230.HotelManagementProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webdevuoit3230.HotelManagementProject.repository.CustomerRepository;

/**
 * 
 */
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }
}
