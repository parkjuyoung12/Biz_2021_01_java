package com.callor.start.keyinput;

import java.util.Random;
import java.util.Scanner;

public class KeyInput_03 {
	public static void main(String[] args) {
		Random rnd = new Random();

		int num1 = rnd.nextInt(100)+1; // +1 을 해서 0~ 99 가 아닌 1~ 100 의 무작위 숫자를 num1에 저장
		
		Scanner scan = new Scanner(System.in); 

		System.out.print("숫자를 입력 >> " ); 
		
		int num2 = scan.nextInt(); // num2
		
		if (num1 > num2 ) { // num1 은 무작위 값 		num2 는 사용자 입력값
			System.out.println(num2 + " 보다 "+ num1 + " 가 크다.");
		}
		else if (num1 < num2 ) { // num1 은 무작위 값 		num2 는 사용자 입력값
			System.out.println(num2 + " 보다 "+ num1 + " 가 작다.");
		} else if (num1 == num2) {
			System.out.println(num2 + " 와 " + num1 + "은 같다.");
		}
		
	}

}
