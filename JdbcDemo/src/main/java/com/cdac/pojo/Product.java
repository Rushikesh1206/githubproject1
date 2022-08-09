package com.cdac.pojo;

public class Product {

	private int pid;
	private String pname;
	private int price;
	private int qty;
	
	public Product(int pid, String pname, int price, int qty) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.qty = qty;
	}
	public Product() {
		
	}
	public int getpid() {
		return pid;
	}
	public void setpid (int pid) {
		this.pid=pid;
	}
	public String getpname() {
		return pname;
	}
	public void setpname(String pname) {
		this.pname=pname;
	}
	public int getprice() {
		return price;
	}
	public void setprice(int price) {
		this.price=price;
	}
	public int getqty() {
		return qty;
	}
	public void setqty(int qty) {
		this.qty=qty;
	}
	
}
