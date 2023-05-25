package com.miniproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniproject.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

}
