package com.callor.applications.service;

// 기존에 어떤 사용자가 만들어논 패키지를 개발을 하기위한
// 개발자가 손쉽게 사용할 수 있도록 만들어진 패키지
import java.util.Scanner;

/*
 * 클래스의 extends(확장, 상속)
 * 
 * ScoreServiceV4 : Parent(부모) 클래스
 * ScoreServiceExtendsV1 : Child(자식) 클래스
 * 
 * 단순한 extends
 * 		부모 클래스에 정의된 모든 method를
 * 		코드한줄 추가, 수정 없이 그대로 사용할 수 있다.
 * 
 * 추가 extends
 * 		부모 클래스에 정의된 method와
 * 		새롭게 추가된 method가 있는
 * 		확장된 클래스의 생성
 * 
 */
			// 선언문			  상속 및 확장을 위한 곳 		
public class ScoreServiceExtendsV1 extends ScoreServiceV4 {

	/*
	 * 문자열형변수 1개를 매개변수로 갖는 input() method
	 */

	// input = 입력 즉, 입력을 받기위한 메서드
	// 입력받은 점수가 0보다 큰가 작은가 그렇지 않은가를 비교하기 위한 메서드이다.
	public int input(String subject) {
		
		Scanner scan = new Scanner(System.in); // 키보드로부터 입력을 받기 위한 초기세팅

		int intScore = 0; // 변수명이 int 이므로 소숫점(실수)이 아닌 점수(정수)값을 0으로 초기화
		while (true) { // 맞다면 반복
			System.out.println("점수 입력 >> "); // Console 에 출력되는 단어
			intScore = scan.nextInt(); // intScore를 키보드로부터 입력받기 위한 세팅 
			
			if(intScore < 0 || intScore > 100) {
				System.out.println(subject + "점수는 0 ~ 100 까지");
			} else {
				break;
			}
			
			if (intScore < 0) { // 만약에 intScore가 0보다 크면? (1 이상)
				System.out.println(subject + "점수는 0점 이상 입력 !!"); // Console에 0점 이상 이 출력된다.
			} else if (intScore > 100) { // 0보다 크지 않으면 else if 문으로 넘어와지면서, intScore 가 100보다 작다면 ?
				System.out.println(subject +  "점수는 100점 이하 입력!!"); // Console에 100점 이하 가 출력된다.
			} else { // 각각 조건이 맞지 않다면 ?
				break; // break 로 인해 if문을 빠져나온다.
			}
		}
		// System.out.println("입력한 점수 : " + intScore); // 사용자가 입력한 점수는 " " 따옴표안에 있는 문구와 함께 점수 출력
		return intScore;
		
		// 호출한 코드에서
		// return 30; ==> int intKor에 30을 담아라
		// return 100; ==> int intKor에 100을 담아라
	}
}