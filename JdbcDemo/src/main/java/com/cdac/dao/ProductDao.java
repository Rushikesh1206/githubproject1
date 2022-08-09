package com.cdac.dao;

import java.util.List;

import com.cdac.pojo.Product;

public interface ProductDao {
	
	//Query Operations
	List<Product> getAllProducts();
	// getAllProducts - we get all products from Product
	// in list we stored all list of product
	Product searchProduct(int productId);
	//it will give single product
	
	// CRUD operations (CRUD - create,read,update,delete)
	boolean addNewProduct(Product product);
	// when we product inserted it will return true vale if not inserted it will return false value
	boolean deleteProduct(int productId);
	// when we product deleted it will return true vale if not deleted it will return false value
	boolean updateProduct(Product product);
	// when we product updated it will return true vale if not updated it will return false value
}
