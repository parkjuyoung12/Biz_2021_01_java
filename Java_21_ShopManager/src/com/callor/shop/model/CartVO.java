package com.callor.shop.model;

public class CartVO {
	private String userName;
	private String productName;
	private String date;
	private String time;
	private int qty;
	private int price;
	private int xprice;

	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		total = qty*price;
		this.total = total;
		
	}
	
	private int total;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getXprice() {
		return xprice;
	}
	public void setXprice(int xprice) {
		xprice = (qty*price);
		this.xprice = xprice;
		
	}
	
	@Override
	public String toString() {
		return "==========================================\n"
				+"구매자\t상품명\t단가\t수량\t합계\n"+ userName +"\t"+ productName +"\t"+  qty +"\t" 
				+ price + "\t"+ total +"\n" +"------------------------------------------\n"+
				"합계\t"+ qty + "가지\t\t\t"+ xprice+"\n==========================================";
	}
}
