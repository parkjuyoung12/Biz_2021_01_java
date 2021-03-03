package com.callor.oop.model;
/*
 * 카트정보를 담아 App에서 사용 할
 * Value Object 클래스
 * 구매자, 상품명, 규격, 
 * 날짜, 시각, 수량, 
 * 구매단가, 구매금액
 */
public class CartVO {
	private String userName;
	private String productName;
	private String standard;
	private String inputDate;
	private String inputTime;
	
	private int qty;
	private int price;
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
	public String getStandart() {
		return standard;
	}
	public void setStandart(String standard) {
		this.standard = standard;
	}
	public String getInputDate() {
		return inputDate;
	}
	public void setInputDate(String inputDate) {
		this.inputDate = inputDate;
	}
	public String getInputTime() {
		return inputTime;
	}
	public void setInputTime(String inputTime) {
		this.inputTime = inputTime;
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
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "CartVO [userName=" + userName + ", productName=" + productName + ", standard=" + standard
				+ ", inputDate=" + inputDate + ", inputTime=" + inputTime + ", qty=" + qty + ", price=" + price
				+ ", total=" + total + "]";
	}
	
	
}
