/**
 * 
 */
package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.BookingService;

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
