/**
 * 
 */
package com.webdevuoit3230.HotelManagementProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webdevuoit3230.HotelManagementProject.model.Booking;
import com.webdevuoit3230.HotelManagementProject.model.Customer;

/**
 * 
 */
@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByCustomerid(Customer customerid);
    
} 
