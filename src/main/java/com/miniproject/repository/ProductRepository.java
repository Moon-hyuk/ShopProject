package com.miniproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniproject.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
