package com.miniproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniproject.entity.ReviewEntity;

public interface ReviewRepository extends JpaRepository<ReviewEntity, Long> {

}
