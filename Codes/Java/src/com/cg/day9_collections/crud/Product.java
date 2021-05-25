package com.cg.day9_collections.crud;

import java.util.Scanner;

public class Product {

	private String pid;
	private String pname;
	private double price;
	
	Scanner sc = new Scanner(System.in);
	Product[] productList = new Product[1];
	
	public Product() {
		
	}

	public Product(String pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public Product[] createProductList(Product[] productList) {
		for (int i=0;i<productList.length;i++) {
			System.out.println("Enter details of Product ");
			productList[i] = new Product();
			productList[i].setPid(sc.nextLine());
			productList[i].setPname(sc.nextLine());
			productList[i].setPrice(Double.parseDouble(sc.nextLine()));
		}
		
		return productList;
	}
	
	public void updateProductById(Product[] productList, String id) {
		for(int i=0;i<productList.length;i++) {
			if(productList[i].getPid().equals(id))
			{
				System.out.println("Product found at " + i);
				System.out.println("Enter new name to update for the Product");
				String updatedname = sc.next();
				productList[i].setPname(updatedname);
				System.out.println("Product ID = " + productList[i].getPid() + "Product name = " + productList[i].getPname());
				break;
			}
			else {
				System.out.println("No employee found");
			}
		}
		System.out.println();
	}
	
	public Product[] deleteProductById(Product[] productList, String id) {
		int originalLength = productList.length;
		boolean found = false;
		
		for (int i=0;i<originalLength;i++) {
			if (productList[i].getPid() == id) {
				System.out.print("ID matched for Product: "+i);
				productList[i] = null;
				System.out.println("Product has been Deleted!");
				found = true;
				break;
			}
		}
		
		if (!found) {
			System.out.println("Product not found for this id");
		}
		
		System.out.println();
		return productList;
	}
	
	public void displayProduct(Product[] productList) {
		for (int i=0;i<productList.length;i++) {
			System.out.print(productList[i].getPid()+" ");
			System.out.print(productList[i].getPname()+" ");
			System.out.print(productList[i].getPrice()+" ");
			System.out.println();
		}
	}
	
	public void displayProductById(Product[] productList, String id) {
		for (int i=0;i<productList.length;i++) {
			if (productList[i].getPid().equals(id)) {
				System.out.println("Product details are: ");
				System.out.print(productList[i].getPid()+" ");
				System.out.print(productList[i].getPname()+" ");
				System.out.print(productList[i].getPrice()+" ");
				break;
			}
			else {
				System.out.println("Product ID not found.");
			}
		}
		System.out.println();
	}
}