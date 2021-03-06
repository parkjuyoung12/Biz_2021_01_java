package com.callor.applications.service;

public class PrimeServiceV2 {
	public int prime(int num) {
		
		int index = 0;
		for(index = 2; index < num; index++) {
			
			if(num % index == 0) {
				// prime() method 실행을 중단하고
				// main() method에게 -1을 되돌려줘라
				return -1;
			} // if end
		} // for end
		
		// num 값이 소수이어서 for() 반복문을 모두 수행하고
		// 여기에 다다르면 num값을 그대로 return 하라	
		return num;
	}					
}