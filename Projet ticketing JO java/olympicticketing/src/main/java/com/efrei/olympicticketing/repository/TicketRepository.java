package com.efrei.olympicticketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efrei.olympicticketing.model.Ticket;

public interface TicketRepository  extends JpaRepository<Ticket, String>{
}
