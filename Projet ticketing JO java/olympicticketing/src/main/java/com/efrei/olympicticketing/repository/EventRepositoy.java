package com.efrei.olympicticketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efrei.olympicticketing.model.Event;

public interface EventRepositoy extends JpaRepository<Event, Long>{
    
}
