package com.kushagar0206.ticketbookingsystem.controller;

import com.kushagar0206.ticketbookingsystem.model.Booking;
import com.kushagar0206.ticketbookingsystem.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/book")
    public ResponseEntity<Booking> bookSeats(@RequestBody BookRequest req) {
        Booking booking = bookingService.bookSeats(req.getUserId(), req.getEventId(), req.getSeats());
        return ResponseEntity.ok(booking);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Booking>> getBookings(@PathVariable Long userId) {
        bookingService.bookSeats(userId);
    }

}
