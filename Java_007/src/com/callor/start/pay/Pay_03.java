package com.callor.start.pay;

public class Pay_03 {
	public static void main(String args[]) {

		int pay = 4_789_800;
		int paper = 100_000;
		
		for (int i = 0 ; pay > 0; i++) {				
			int count = pay / paper;
			pay = pay - (paper * count);
			System.out.println(pay + " 원 " + count + "장");
			
			if(i % 2 == 0) { // sw가 0보다 작으면
				paper = paper / 5;
			} else { // 그렇지 않으면
				paper = paper / 2;
			}
		}
	}
}