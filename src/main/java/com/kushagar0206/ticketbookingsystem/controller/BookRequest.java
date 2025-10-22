package com.kushagar0206.ticketbookingsystem.controller;

import lombok.Data;

@Data
public class BookRequest {
    private Long userId;
    private Long eventId;
    private int seats;

}

