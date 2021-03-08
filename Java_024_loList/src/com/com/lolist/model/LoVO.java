package com.com.lolist.model;

public class LoVO {
	private String day; //일자
	private String productName; // 상품명
	private String acountName; // 거래처명
	private String repName; // 대표자명
	private int sort; // 구분
	private int buy; // 매입단가
	private int sal; // 매출단가
	private int count; // 수량
	
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getAcountName() {
		return acountName;
	}
	public void setAcountName(String acountName) {
		this.acountName = acountName;
	}
	public String getRepName() {
		return repName;
	}
	public void setRepName(String repName) {
		this.repName = repName;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public int getBuy() {
		return buy;
	}
	public void setBuy(int buy) {
		this.buy = count * buy;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal * count;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "LoVO [day=" + day + ", productName=" + productName + ", acountName=" + acountName + ", repName="
				+ repName + ", sort=" + sort + ", buy=" + buy + ", sal=" + sal + ", count=" + count + "]";
	}
	
	
	
	
}
