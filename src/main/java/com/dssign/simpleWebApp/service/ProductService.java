package com.dssign.simpleWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dssign.simpleWebApp.model.Product;

@Service
public class ProductService {

	List<Product> products = new ArrayList<>(Arrays.asList(
		new Product(101, "Iphone	14", 120000),
		new Product(102, "Samsung Galaxy S23", 100000),
			new Product(103, "OnePlus 11", 80000),
			new Product(104, "Google Pixel 8", 90000)));

	public List<Product> getProducts() {
		return products;
	}

	public Product getProductById(int prodId){
		return products.stream()
				.filter(product -> product.getProdId() == prodId)
				.findFirst()
				.orElse(new Product(100, "No Item", 8));
	}

	public void addProduct(Product prod){
		products.add(prod);
	}

	public void updateProduct(Product prod){
		int index = -1;
		for(int i=0; i<products.size(); i++){
			if(products.get(i).getProdId() == prod.getProdId()){
				index = i;
				break;
			}
		}
		products.set(index, prod);
	}

	public	void deleteProduct(int prodId){
		products.removeIf(product -> product.getProdId() == prodId);
	}
}
