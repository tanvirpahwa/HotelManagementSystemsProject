package com.webdevuoit3230.HotelManagementProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webdevuoit3230.HotelManagementProject.model.Customer;

import jakarta.transaction.Transactional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByName(String name);

    @Transactional
    default Customer addCustomer(Customer customer) {
        return save(customer);
    }

    default List<Customer> getAllCustomers() {
        return findAll();
    }
}