package com.callor.applications.service;

public class ClassServiceV7 {
/*
 * 구구단 출력
 */
	public void gugu(int dan) {
		
		if (dan >= 2 && dan < 10) {
			for (int i = 2; i < 10; i++) {
				System.out.println(dan + " x " + i + " = " + (dan * i));

			} 
		} else{
			System.out.println("2~9 까지의 정수만 입력해주세요.");
		}
	}
	public void gugudan() {
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
				
			}
			System.out.println("");
		}
	}
}
