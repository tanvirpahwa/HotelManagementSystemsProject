/**
 * 
 */
package com.webdevuoit3230.HotelManagementProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webdevuoit3230.HotelManagementProject.model.Booking;
import com.webdevuoit3230.HotelManagementProject.model.Customer;

import jakarta.transaction.Transactional;

/**
 * 
 */
@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByCustomerid(Customer customerid);

    @Transactional
    default Booking addBooking(Booking booking) {
        return save(booking);
    }

    default List<Booking> getAllBookings() {
        return findAll();
    }
}
