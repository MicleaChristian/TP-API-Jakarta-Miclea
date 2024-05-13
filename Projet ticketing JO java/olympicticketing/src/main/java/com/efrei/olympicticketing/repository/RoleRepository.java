package com.efrei.olympicticketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efrei.olympicticketing.model.Role;

public interface RoleRepository extends JpaRepository<Role, String>{
    
}
