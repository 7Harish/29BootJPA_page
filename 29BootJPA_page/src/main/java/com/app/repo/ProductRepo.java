package com.app.repo;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
	Page<Product> findByProdCost(Double prodCost,Pageable pageRequest);
}
