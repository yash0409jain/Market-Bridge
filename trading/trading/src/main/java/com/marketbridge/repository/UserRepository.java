package com.marketbridge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketbridge.modal.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
