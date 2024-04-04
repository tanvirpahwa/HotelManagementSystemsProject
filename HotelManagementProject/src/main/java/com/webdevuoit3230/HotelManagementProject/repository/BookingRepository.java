/**
 * 
 */
package com.webdevuoit3230.HotelManagementProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webdevuoit3230.HotelManagementProject.model.Booking;

/**
 * 
 */
@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    
} 
