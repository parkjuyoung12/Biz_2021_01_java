package com.callor.applications;

import com.callor.applications.service.ScoreServiceV4;

public class Score_05 {
	public static void main(String[] args) {
		ScoreServiceV4 scV4 = new ScoreServiceV4();
		
		scV4.print(82, 83, 77);
		int intKor = 90;
		int intEng = 100;
		int intMath = 100;
		
		scV4.print(intKor, intEng, intMath);
		
	}
}
