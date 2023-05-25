package com.miniproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniproject.entity.CartEntity;

public interface CartRepository extends JpaRepository<CartEntity, Long> {

}
