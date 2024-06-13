package com.ey.jdbc.task;

import java.util.List;

public class ProductUI {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		ProductService ps = new ProductService();
		//Product p = new Product(1,"bulb");
		//ps.addProduct(p);
		//ps.updateProduct(1, "bulb");
		//ps.deleteProduct(1);
		System.out.println(ps.dispOneProduct(2));
		List<Product> list=ps.listAllProducts();
		list.forEach(System.out::println);

	}

}
