package com.wcs.checkpoinr3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wcs.checkpoinr3.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}