package com.marialeitao.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marialeitao.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
