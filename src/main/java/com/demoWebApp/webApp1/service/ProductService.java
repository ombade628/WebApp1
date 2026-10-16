package com.demoWebApp.webApp1.service;

import java.util.Arrays;
import java.util.List;
//import java.util.stream;

import org.springframework.stereotype.Service;
import com.demoWebApp.webApp1.model.Product;

@Service
public class ProductService {
	 
	List<Product> products = Arrays.asList(new Product(1,"Ipone",100000), new Product(2,"Samsung", 50000 ), new Product(3,"Vivo",20000) ) ; 
	public List<Product> getProducts() {
		return products ;  
	}
	public Product getProductById(int prodId) {

//		return products.stream().filter(p->p.getProdId()==prodId ).findFirst().get() ;
		return products.stream().filter(p-> p.getProdId() == prodId).findFirst().get(); 
	}
}
												
