package com.callor.ex;

public class ImplicitConversion {
	public static void main(String[] args) {
		byte bnum = 10;
		int iNum = bnum;
		
		System.out.println(bnum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dnum;
		dnum = fNum + iNum;
		System.out.println(dnum);
	}
}
