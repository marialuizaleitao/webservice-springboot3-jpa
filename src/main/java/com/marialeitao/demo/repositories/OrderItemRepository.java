package com.marialeitao.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marialeitao.demo.entities.OrderItem;
import com.marialeitao.demo.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}