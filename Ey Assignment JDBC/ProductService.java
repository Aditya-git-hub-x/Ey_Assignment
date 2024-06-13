package com.ey.jdbc.task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductService {
	
	public void addProduct(Product product) throws Exception{
		Connection con=DbConn.getConnection();
		PreparedStatement pst=con.prepareStatement("insert into product values(?,?)");
		pst.setInt(1, product.id);
		pst.setString(2, product.name);
		pst.execute();
		System.out.println("product added");
	}
	public void updateProduct(int i_d, String n) throws Exception{
		Connection con=DbConn.getConnection();
		PreparedStatement pst=con.prepareStatement("update product set name=? where id=?");
		pst.setString(1, n);
		pst.setInt(2, i_d);
		pst.execute();
		System.out.println("product updated");
	}
	public void deleteProduct(int id) throws Exception {
		Connection con=DbConn.getConnection();
		PreparedStatement pst=con.prepareStatement("delete from product where id=?");
		pst.setInt(1, id);
		pst.execute();
		System.out.println("product deleted");
	}
	public Product dispOneProduct(int id) throws Exception, SQLException {
		Connection con=DbConn.getConnection();
		PreparedStatement pst=con.prepareStatement("Select * from product where id=?");
		pst.setInt(1, id);
		ResultSet rs=pst.executeQuery();
		Product p=null;
		while(rs.next()){
			p = new Product(rs.getInt(1), rs.getString(2));
		}
		System.out.println("product displayed");
		return p;
	}
	public List<Product> listAllProducts() throws Exception{
		Connection con=DbConn.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("Select * from product");
		List<Product> Plist = new ArrayList<>();
		while(rs.next()) {
			Product p=new Product(rs.getInt(1), rs.getString(2));
			Plist.add(p);
		}
		
		System.out.println("List of all products : ");
		return Plist;
	}
}