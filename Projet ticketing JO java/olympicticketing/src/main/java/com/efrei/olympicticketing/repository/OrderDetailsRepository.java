package com.efrei.olympicticketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efrei.olympicticketing.model.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails ,String>{
}