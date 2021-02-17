package com.callor.applications;

import java.util.Scanner;

public class Score_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			//prompt
			//Scanner이 nextint()를 사용하여
			//키보드 입력을 받는 코드가 실행되면
			// 화면에 아무것도 없이
			// 멈춘것처럼 보이는 현상이 있는데
			// 미리 어떤 일을 할 것 인지 알려주는 메시지
			System.out.print("국어 점수를 입력하세요>> ");
			

			// scan.nextint() 메서드를 호출하면
			// 코드 동작이 멈추고, 사용자가 키보드로
			// 무엇인가 입력한 후 Enter를 누를때까지
			// 이후 코드가 실행되지 않는다.
			int score1 = scan.nextInt();
			

			System.out.print("영어 점수를 입력하세요>> ");
			int score2 = scan.nextInt();

			System.out.print("수학 점수를 입력하세요>> ");
			int score3 = scan.nextInt();
			
			int sum = score1 + score2 + score3;
			
			// avg 변수는 실수형이지만
			// sum 은 정수형, 3도 정수형이기때문에
			// avg 변수에 저장되는 값은
			// 소수점 이하가 무조건 0으로 세팅된다.
			float avg = sum / 3.0f;

			// 결과값을 실수형(float)으로 하고자 할때는
			// sum변수 값이나 숫자 3을 실수형으로 만들어 줘야한다.
			
			// 1. sum 을 실수형으로 변경하고 계산하기
			// 정수형 sum에 담긴 값을
			// float 형 값으로 강제 형변환 하여 나눗셈 준비
			avg = (float)sum /3; // (double)sum / 3
			
			// 2. 숫자 3을 실수형으로 만들어서 나눗셈
			// sum을 실수 3.0f로 나눗셈을 지시하면
			// 	sum 변수에 담긴 값은 
			// 자동형변환(자동으로 실수형으로 변환된다.)
			avg = sum / 3.0f; // /3.0d
			avg = sum / (float)3;
			
			
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
				System.out.println("각각 점수를 0 이상, 100 이하로 입력하시오.");
			}
		}	
	}
}
