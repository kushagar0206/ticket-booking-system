package com.kushagar0206.ticketbookingsystem.service.impl;

import com.kushagar0206.ticketbookingsystem.model.Booking;
import com.kushagar0206.ticketbookingsystem.model.Event;
import com.kushagar0206.ticketbookingsystem.model.User;
import com.kushagar0206.ticketbookingsystem.repository.BookingRepository;
import com.kushagar0206.ticketbookingsystem.repository.EventRepository;
import com.kushagar0206.ticketbookingsystem.repository.UserRepository;
import com.kushagar0206.ticketbookingsystem.service.BookingService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BookingServiceimpl implements BookingService {

    @Autowired
        private EventRepository eventRepo;

        @Autowired
        private BookingRepository bookingRepo;

        @Autowired
        private UserRepository userRepo;

        @Transactional
        public Booking bookSeats(Long userId, Long eventId, int seats) {
            User user = userRepo.findById(userId)
                    .orElseThrow(() -> new IllegalArgumentException("Invalid user"));
            Event event = eventRepo.findById(eventId)
                    .orElseThrow(() -> new IllegalArgumentException("Invalid event"));

            if(event.getAvailableSeats() < seats) {
                throw new IllegalStateException("Not enough seats available");
            }

            event.setAvailableSeats(event.getAvailableSeats() - seats);
            eventRepo.save(event);

            Booking booking = new Booking();
            booking.setUser(user);
            booking.setEvent(event);
            booking.setBookingTime(LocalDateTime.now());
            booking.setSeatsBooked(seats);
            booking.setStatus("CONFIRMED");

            return bookingRepo.save(booking);
        }

}
