package com.kushagar0206.ticketbookingsystem.repository;

import com.kushagar0206.ticketbookingsystem.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {

}

