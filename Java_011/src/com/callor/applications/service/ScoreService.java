package com.callor.applications.service;

import java.util.Scanner;

/*
 * java의 class와 method() 호출
 * ScoreService 클래스에는 main() methond 가 없어서
 * 여기에 있는 코드는 직접 Run(^F11)하여 실행 할 수 없다.
 * 누군가가 ScoreService를 객체, 인스턴스로 만들고 
 * score() method를 호출해 주어야만 코드를 실행 할 수 있다.
 * 
 * 다른 언어에서는 module 등의 이름으로 사용한다.
 * 
 */
public class ScoreService {
	
	/*
	 * 클래스와 메서드(메소드, method)의 명명법
	 * 클래스 : 첫글자 영문대문자, 이후 영문대소문자 숫자 
	 * 메서드 ; 첫글자 영문소문자, 이후 영문대소문자 숫자 
	 * 
	 * 클래스 명명법 (Upper) CamelCase 라고 한다.
	 * 메서드 명명법 (Lower) CamelCase 라고 한다.
	 */
	
	public void score() {
Scanner scan = new Scanner(System.in);
		
		while(true) {
		
			System.out.print("국어 점수를 입력하세요>> ");
			

			int score1 = scan.nextInt();
			

			System.out.print("영어 점수를 입력하세요>> ");
			int score2 = scan.nextInt();

			System.out.print("수학 점수를 입력하세요>> ");
			int score3 = scan.nextInt();
			
			int sum = score1 + score2 + score3;
		
			float avg = sum / 3.0f;
			
			boolean num1 = score1 >= 0 && score1 <= 100;
			boolean num2 = score2 >= 0 && score2 <= 100;
			boolean num3 = score3 >= 0 && score3 <= 100;
			
			if(num1 && num2 && num3) {
			
		System.out.println("=======================================");
		System.out.println("국어 	영어	수학	총점	평균");
		System.out.println("---------------------------------------");
		System.out.print(score1	+	"	");
		System.out.print(score2 +	"	");
		System.out.print(score3 +	"	");
		System.out.print(sum+	"	");
		System.out.println(avg + 	"	");
		System.out.println("=======================================");
		break;
		
			} else {
				System.out.println("각각 점수를 0 이상, 100 이하로 다시 입력하시오.");
			}
		}	
	}

}
