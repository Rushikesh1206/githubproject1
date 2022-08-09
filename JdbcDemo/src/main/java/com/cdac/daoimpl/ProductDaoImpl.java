package com.cdac.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.cdac.dao.ProductDao;
import com.cdac.pojo.Product;
import connection.Dbconnection;

public class ProductDaoImpl implements ProductDao {

	@Override
	public List<Product> getAllProducts() {
		List<Product> 1stProducts = new ArrayList<>();
		try(Connection con = Dbconnection.getDatabaseConnection()){
			PreparedStatement pst= con.prepareStatement("SELECT * FROM PRODUCT");
			ResultSet rs = pst.executeQuery();
			
			if(rs.isBeforeFirst()) {
				while(rs.next()) {
					Product product = new Product();
					product.setpid(rs.getInt("pid"));
					product.setpname(rs.getString("pname"));
					product.setprice(rs.getInt("price"));
					product.setqty(rs.getInt("qty"));
					
					1stProducts.add(product);
				}
			}
			return 1stProducts;
		}
		catch(SQLException e){
			e.printStackTrace();
			1stProducts.clear();
			return 1stProducts;
		}
		return null;
	}

	@Override
	public Product searchProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addNewProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProduct(int productId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

		
}
