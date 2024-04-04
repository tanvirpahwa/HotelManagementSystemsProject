/**
 * 
 */
package com.webdevuoit3230.HotelManagementProject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.webdevuoit3230.HotelManagementProject.model.Booking;
import com.webdevuoit3230.HotelManagementProject.repository.BookingRepository;

/**
 * 
 */
@Service
public class BookingService {
    private final BookingRepository bookingRepository;
    
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }
    
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public void addBooking(Booking booking) {
        if (booking != null) {
            bookingRepository.save(booking);
        } else {
            // Handle the case where booking is null
            throw new IllegalArgumentException("Booking cannot be null");
        }
    }

    // Add similar methods for update and delete operations
    
}
