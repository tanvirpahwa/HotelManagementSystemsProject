/**
 * 
 */
package com.webdevuoit3230.HotelManagementProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.webdevuoit3230.HotelManagementProject.model.Booking;
import com.webdevuoit3230.HotelManagementProject.service.BookingService;

/**
 * 
 */
@Controller
@RequestMapping("/bookings")
public class BookingController {

    private final BookingService bookingService;

    
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping
    public String showBooking(Model model) {
        model.addAttribute("bookings", bookingService.getAllBookings());
        model.addAttribute("booking", new Booking());
        return "bookings";
    }

    @GetMapping("/add")
    public String showAddBookingForm(Model model) {
        model.addAttribute("booking", new Booking());
        return "addBooking";
    }

    @PostMapping("/add")
    public String addBooking(@ModelAttribute Booking booking) {
        bookingService.addBooking(booking);
        return "redirect:/bookings";
    }
}
