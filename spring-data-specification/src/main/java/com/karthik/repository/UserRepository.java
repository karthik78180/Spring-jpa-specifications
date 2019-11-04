package com.karthik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karthik.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
