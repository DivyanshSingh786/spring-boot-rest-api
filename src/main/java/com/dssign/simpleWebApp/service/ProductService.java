package com.dssign.simpleWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.dssign.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dssign.simpleWebApp.model.Product;

@Service
public class ProductService {

	@Autowired
	ProductRepo repo;

//	List<Product> products = new ArrayList<>(Arrays.asList(
//		new Product(101, "Iphone	14", 120000),
//		new Product(102, "Samsung Galaxy S23", 100000),
//			new Product(103, "OnePlus 11", 80000),
//			new Product(104, "Google Pixel 8", 90000)));

	public List<Product> getProducts() {
		return repo.findAll();
	}

	public Product getProductById(int prodId){
		return repo.findById(prodId).orElse(new Product());
	}

	public void addProduct(Product prod){
		repo.save(prod);
	}

	public void updateProduct(Product prod){
		repo.save(prod);
	}

	public	void deleteProduct(int prodId){
		repo.deleteById(prodId);
	}
}
