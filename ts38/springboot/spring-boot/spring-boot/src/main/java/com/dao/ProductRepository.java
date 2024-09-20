package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dto.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	
	@Query("from Product p where p.pname = :pname")
	Product findByName(@Param("pname") String pname);


	

}
