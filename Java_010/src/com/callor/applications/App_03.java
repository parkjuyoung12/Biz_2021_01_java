package com.callor.applications;

import java.util.*;

public class App_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자입력(2 ~ 9) >> ");

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
}
