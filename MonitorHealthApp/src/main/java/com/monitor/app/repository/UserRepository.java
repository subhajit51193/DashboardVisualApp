package com.monitor.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.monitor.app.entity.User;

public interface UserRepository extends JpaRepository<User, String>{

}
