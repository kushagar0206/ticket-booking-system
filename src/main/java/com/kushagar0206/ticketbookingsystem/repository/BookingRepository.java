package com.kushagar0206.ticketbookingsystem.repository;

import com.kushagar0206.ticketbookingsystem.model.Booking;
import com.kushagar0206.ticketbookingsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByUser(User user);

}

