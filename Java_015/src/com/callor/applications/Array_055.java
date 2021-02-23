package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_055 {
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		// 배열 100개 선언
		int[] intNums = new int[100];

		for (int index = 0; index < intNums.length; index++) {

			intNums[index] = rnd.nextInt(100) + 1; // 1~100까지의 난수
		}
		System.out.println("정수 1~ 10 중에 입력 ");
		System.out.println(">>");

		int keyNum = scan.nextInt();

		int pos = 0;
		for (pos = 0; pos < intNums.length; pos++) {
			if (intNums[pos] == keyNum) {
				break;
			}
		}
		if (pos < intNums.length) {
			System.out.println(pos + " 위치에서 최초 발견");
		} else {
			System.out.println("배열에 찾은 값이 없음");
		}
	}
}
