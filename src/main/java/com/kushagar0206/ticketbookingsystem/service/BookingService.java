package com.kushagar0206.ticketbookingsystem.service;

import com.kushagar0206.ticketbookingsystem.model.Booking;

public interface BookingService {

    public Booking bookSeats(Long userId, Long eventId, int seats);

}

