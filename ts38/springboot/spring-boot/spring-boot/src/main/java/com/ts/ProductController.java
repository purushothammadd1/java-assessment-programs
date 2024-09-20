package com.ts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ProductDAO;
import com.dto.Product;

@RestController
public class ProductController {
	
	//Dependency Injection for ProductDAO
	@Autowired
	ProductDAO prodDAO;
	
	
	
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts() {

		return prodDAO.getAllProducts();
	}
	
	@GetMapping("/getProductById/{id}")
	public Product getProductById(@PathVariable("id") int pid) {
		return 	prodDAO.getProductById(pid);
	}
	
	@GetMapping("/getProductByName/{name}")
	public Product getProductByName(@PathVariable("name") String pname) {
		return prodDAO.getProductByName(pname);
	}
	
//	@GetMapping("/getProductByDeleteId/{id}")
//	public String getProductByDeleteId(@PathVariable("id") int id) {
//		return prodDAO.getProductByDeleteId(id);
//	}
	@DeleteMapping("/deleteProductById/{id}")
	public String deleteProductById(@PathVariable("id") int pid) {
		
		prodDAO.deleteProductById(pid);
		
		return "Product Deleted!!!";
	}
	
	@PostMapping("/registerProduct")
	public Product registerProduct(@RequestBody Product product) {
		return prodDAO.registerProduct(product);
	}
	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product product) {
		return prodDAO.updateProduct(product);
	}
	@GetMapping("/getProductHC")
	public Product getProductHC() {
		Product product = new Product(101, "Laptop", 54999.00);
		return product;		
	}
	
	@GetMapping("/getAllProductsHC")
	public List<Product> getAllProductsHC() {
		Product prod=new Product(101, "Laptop", 89000);
		Product prod1=new Product(102, "Mobile", 29000);
		Product prod2=new Product(103, "DSLR Camera", 24900);
		
		List<Product> prodList=new ArrayList<Product>();
		prodList.add(prod);
		prodList.add(prod1);
		prodList.add(prod2);
		return prodList;
	}
}
