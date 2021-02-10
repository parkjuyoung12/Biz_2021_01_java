package com.callor.applications;

import java.util.*;

public class App_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("숫자입력(2 ~ 9) >> ");
		int num = scan.nextInt();

		// 첫번째 방법 break 문 있음.
	/*	for (int i = 0; i < 8; i++) {	
			
			int num1 = i + 2;
			
			if(num < 10 && num > 1) {
				
				System.out.println( num + " x " + num1 + " = " + num * num1);
			} else {
				System.out.println("입력한 숫자가 2 ~ 9 이외의 값입니다. ");
			
			break;
			}
		}
		*/
		
		// 2번째 방법 ( break  문 없음)
		if( num > 9 || num < 2) {
			System.out.println("입력한 숫자가 " + num + " 이므로 2 ~ 9 이외의 값입니다.");
			
		} else { 
			System.out.println("===============================");
			System.out.println("구구단 " +num + " 단");
			System.out.println("-------------------------------");
			for(int i = 0 ; i < 8; i++) {
				int num1 = i + 2;
				
				System.out.println( num + " x " + num1 + " = " + num * num1);
			}
		}
		int num1 = scan.nextInt();
		boolean bYes2 = num1 >= 2;
		boolean bYes9 = num1 <= 9;
		if( bYes2 && bYes9) {
			System.out.println("===============================");
			System.out.println("구구단 " +num1 + " 단");
			System.out.println("-------------------------------");
			for(int i = 0; i< 8; i++) {
				int num2 = i + 2;
				System.out.println( num1 + " x " + num2 + " = " + num1 * num2);
			}
		}else {
			System.out.println("입력한 숫자가 2~9가 아니다. ");
		}
		
	}
}
