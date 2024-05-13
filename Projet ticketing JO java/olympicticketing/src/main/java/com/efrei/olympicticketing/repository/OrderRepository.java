package com.efrei.olympicticketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efrei.olympicticketing.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
}
