package com.callor.varriabel;

public class Varriable_02 {
	public static void main(String[] args) {
		
	// 연산하고자 하는 원래 값이 저장되는 변수
	int num1;
	int num2;
	
	// 변수에 연산할 값을 저장하기
	num1 = 50;
	num2 = 70;
	
	// 연산결과를 저장할 변수 선언과 초기화
	int result1 = 0;
	int result2 = 0;
	int result3 = 0;
	float result4 = 0;
	float result5 = 0;
	
	// 연산결과를 변수에 저장하기
	result1 = num1 + num2;
	result2 = num2 - num1;
	result3 = num1 * num2;
	result4 = num2 / num1;
	result5 = num2 % num1;
	
	// 변수에 저장된 결과를 Console에 출력
	// 30 + 40 = 70
	System.out.println("30 + 40 = " + (30 + 40));
	
	// 덧셈
	System.out.print(num1);
	System.out.print(" + ");	
	System.out.print(num2);
	System.out.print(" = ");
	System.out.println(result1);
	
	// 뺄셈
	System.out.print(num2);
	System.out.print(" - ");	
	System.out.print(num1);
	System.out.print(" = ");
	System.out.println(result2);

	// 곱셈
	System.out.print(num1);
	System.out.print(" x ");	
	System.out.print(num2);
	System.out.print(" = ");
	System.out.println(result3);
	
	// 덧셈
	System.out.print(num2);
	System.out.print(" ÷ ");	
	System.out.print(num1);
	System.out.print(" = ");
	System.out.println(result4);
	
	// 나머지
	System.out.print(num2);
	System.out.print(" mod ");	
	System.out.print(num1);
	System.out.print(" = ");
	System.out.println(result5);
			
	}
}
