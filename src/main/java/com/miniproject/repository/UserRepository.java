package com.miniproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniproject.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
