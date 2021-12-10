package com.himanshu.springweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.himanshu.springweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
