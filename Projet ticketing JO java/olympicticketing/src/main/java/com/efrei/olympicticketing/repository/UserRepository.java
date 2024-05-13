package com.efrei.olympicticketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.efrei.olympicticketing.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
}
