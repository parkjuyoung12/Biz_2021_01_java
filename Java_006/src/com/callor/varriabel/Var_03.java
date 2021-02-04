package com.callor.varriabel;

public class Var_03 {
	public static void main(String[] args) {
		System.out.println("========================================");
		System.out.println("구구단");
		System.out.println("----------------------------------------");
		
		int intDan = 3;
		int num1 = 1;
		
		System.out.print(intDan);
		System.out.print(" x ");
		System.out.print(num1);
		System.out.print(" = ");
		System.out.println(intDan * num1);
		
		num1 += 1;
		System.out.print(intDan);
		System.out.print(" x ");
		System.out.print(num1);
		System.out.print(" = ");
		System.out.println(intDan * num1);
		
		int a, b;
		
		for(a=3; a<4; a++) {
			for(b=1; b<=9; b++) {
				System.out.println(a + " x " + b + " = "+ a * b);
			}
		}
		
	}
}
