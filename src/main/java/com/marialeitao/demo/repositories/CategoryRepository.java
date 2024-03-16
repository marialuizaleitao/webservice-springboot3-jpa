package com.marialeitao.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marialeitao.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
