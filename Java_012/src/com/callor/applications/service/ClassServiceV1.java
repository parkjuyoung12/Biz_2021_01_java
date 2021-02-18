package com.callor.applications.service;

public class ClassServiceV1 {
	/*
	 * Java 코딩을 할때 { } 내에서 같은이름의 변수는 2번 이상
	 * 선언 불가
	 * 
	 * Class { } 내에서 같은 이름의 메서드는 2번 이상
	 * 선언 불가
	 * 
	 *  하지만, Java에서는 메서드의 매개변수 개수, 타입 이 다르면
	 *  같은 이름의 메서드를 중복하여 선언 할 수 있다.
	 *  
	 * public void sum() {
	 * }
	 * 
	 * public void sum() {
	 * }
	 */
	
	public void sum(int num1, int num2) {
		
	}
	
	public void sum(int num1, float num2) {
		
	}
	
	public void add(int num1, int num2) {
		System.out.println("정수 2개 덧셈");
		System.out.println(num1 + num2); // 정수 2개를 매개변수로 받아 덧셈
		
	}
	
	public void add(int num1, float fnum1) {
		System.out.println("정수 1개 실수 1개 덧셈");
		System.out.println(num1 + fnum1); // 정수1개 float 형 실수 1개를 매개변수로 받아 덧셈
		
	}
	
	public void add(double num1, float num2) { // double 형 실수1개 float형 실수 1개
		System.out.println("사칙연산 + : " + num1 + num2);
		System.out.println("사칙연산 - : " + ((float)num2 - (double)num1));
		System.out.println("사칙연산 * : " + num1 * num2);
		System.out.println("사칙연산 / : " + num1 / num2);
		
	}
}
