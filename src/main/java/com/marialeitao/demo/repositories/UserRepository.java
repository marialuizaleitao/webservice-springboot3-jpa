package com.marialeitao.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marialeitao.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
