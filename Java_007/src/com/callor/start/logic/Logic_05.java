package com.callor.start.logic;

public class Logic_05 {
	/*
	 * 화폐 매수 계산
	 * 
	 * 4789800
	 */
	public static void main(String[] args) {
		int pay = 4_789_800;
		int paper = 50_000;
		int count = pay / paper;
		System.out.println(paper + " 원권 : " + count + " 매");
		
		//1만원권 계산
		// pay에서 5만워누권 금액만큼 제외하고
		// 1만원권 매수를 계산
		pay =  pay - (paper * count);
		System.out.println("남은금액 : " + pay);
		paper = paper / 5;
		count = pay / paper;
		System.out.println(paper + " 원권 : " + count + " 매");
		
		// 5천원권 계산
		// pay에서 1만원권 금액을 제외한 금액
		pay -= (paper * count);
		paper /= 2;
		count = pay / paper;
		System.out.println(paper + " 원권 : " + count + " 매");		
		
		// 1천원권 계산
		// pay에서 5천원권 금액을 제외한 금액
		pay -= (paper * count);
		paper /= 5;
		count = pay / paper;
		System.out.println(paper + " 원권 : " + count + " 매");		
		
		// 500원 계산
		// pay에서 1천원권 금액을 제외한 금액
		pay -= (paper * count);
		paper /= 2;
		count = pay / paper;
		System.out.println(paper + " 원권 : " + count + " 매");		
				
	}
}
