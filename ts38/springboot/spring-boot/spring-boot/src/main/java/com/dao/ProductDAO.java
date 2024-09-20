package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.Product;

@Service
public class ProductDAO {

	@Autowired
	ProductRepository productRepo;


	public List<Product> getAllProducts() {

		return productRepo.findAll();
	}


	public Product getProductById(int pid) {

		return productRepo.findById(pid).orElse(new Product(0, "Product Not Found!!!", 0.0));
	}


	public Product getProductByName(String pname) {

		Product product = productRepo.findByName(pname);

		if (product != null) {
			return product;
		}

		return new Product(0, "Product Not Found!!!", 0.0);
	}


//	public String getProductByDeleteId(int id) {
//		
//		 productRepo.deleteById(id);
//		 return "sucessfully";
//		 
//	}


	public void deleteProductById(int pid) {
		productRepo.deleteById(pid);
		
	}


	public Product registerProduct(Product product) {
		
		return productRepo.save(product);
	}

	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepo.save(product);
	}

}




