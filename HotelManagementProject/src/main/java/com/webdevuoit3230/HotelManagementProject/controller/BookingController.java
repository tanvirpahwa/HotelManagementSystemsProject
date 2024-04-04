/**
 * 
 */
package com.webdevuoit3230.HotelManagementProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.webdevuoit3230.HotelManagementProject.service.BookingService;

/**
 * 
 */
@Controller
public class BookingController {
    @Autowired
    private BookingService bookingService;
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }
    public BookingService getBookingService() {
        return bookingService;
    }
}
