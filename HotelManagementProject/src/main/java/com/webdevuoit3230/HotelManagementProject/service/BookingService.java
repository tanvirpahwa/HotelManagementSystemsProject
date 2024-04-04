/**
 * 
 */
package com.webdevuoit3230.HotelManagementProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webdevuoit3230.HotelManagementProject.repository.BookingRepository;

/**
 * 
 */
@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }
    public BookingRepository getBookingRepository() {
        return bookingRepository;
    }
    
}
