package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.PrimeServiceV2;

public class Prime_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("2 이상의 정수 입력");
		System.out.print(">> ");
		int num = scan.nextInt(); // num 변수를 키보드로 입력받기위한 세팅
		
		PrimeServiceV2 psV2 = new PrimeServiceV2(); // method 호출
		
		int result = psV2.prime(num); // PrimeServiceV2에 있는 prime(num) method를 불러와 result에 할당
		if(result < 0) { // result (num 값을 나눴을때 나머지가 0인가?)
			System.out.println(num + " 는 소수가 아님");
		}
		else { // 아니다.
			System.out.println(num + " 는 소수");
		}
	}

}
