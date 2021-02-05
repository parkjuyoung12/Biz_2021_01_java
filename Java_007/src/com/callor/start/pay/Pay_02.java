package com.callor.start.pay;

public class Pay_02 {
	public static void main(String args[]) {

		int pay = 4_789_800;
		int paper = 100_000;
		
		int sw = -1;
		for ( ; pay > 0; ) {				
			int count = pay / paper;
			pay = pay - (paper * count);
			System.out.println(pay + " 원 " + count + "장");
			
			if(sw < 0) { // sw가 0보다 작으면
				paper = paper / 5;
			} else { // 그렇지 않으면
				paper = paper / 2;
			}
			sw *= (-1);
		}
	}
}