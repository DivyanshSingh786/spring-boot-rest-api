package com.dssign.simpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Product {
	@Id
	private int prodId;
	private String prodName;
	private int price;
}
