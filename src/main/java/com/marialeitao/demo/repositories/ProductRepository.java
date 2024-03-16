package com.marialeitao.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marialeitao.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
