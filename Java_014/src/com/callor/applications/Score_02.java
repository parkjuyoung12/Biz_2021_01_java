package com.callor.applications;

/*
 * 학생 3명의 국어, 영어, 수학 점수를
 * 키보드로 입력받아서
 * Console에 리스트를 출력하기
 * 
 * 1. 학생 3명의 3과목의 점수를 저장할 배열
 * 2. 배열이 나오면 일단 for 반복문이 한번쯤은 나타난다.
 * 3. 학생 3명의 3과목의 점수를 어떻게 입력받을 것인가?
 * 4. 학생 3명의 과목 점수를 어떻게 출력할 것인가 ?
 */
import java.util.Scanner;

public class Score_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("학생 3명의 점수를 입력하세요");

		/*
		 * 변수는 1개의 변수에 1개의 값만 저장할 수 있다. => 3명 학생의 과목 점수를 저장해야 하기 떄문에 각 과목을 배열로 선언 => 몇개의
		 * 배열이 필요한지 명시(알려주기)
		 */

		// [개수] : 필요한 개수만큼 배열을 만들어라.
		String[] strname1 = new String[3];
		
		String[] strname2 = new String[3];
		strname2[0] = "국어";
		strname2[1] = "영어";
		strname2[2] = "수학";

		String[] intKor = new String[3];
		String[] intEng = new String[3];
		String[] intMath = new String[3];

		// 3명 학생의 과목 성적 입력받기
		// 1. 국어 과목의 3학생 점수를 입력받기.
		// 2. 학생별로 국어, 영어, 수학 점수를 각각 입력받기
		int i = 0;
		for (i = 0; i < strname2.length; i++) { // i(반복문)는 strname.length(배열의 길이) 보다 짧아야한다.
			System.out.println((i + 1) + "번 학생"); // (i+1) : 0부터 시작하기떄문에 +1을 해줌.

			System.out.print("이름 >> ");
			strname1[i] = scan.nextLine();

			System.out.print(strname2[0] + " 점수 >> "); // 국어점수 입력
			intKor[i] = scan.nextLine();

			System.out.print(strname2[1] + " 점수 >> "); // 영어 점수 입력
			intEng[i] = scan.nextLine();

			System.out.print(strname2[2] + " 점수 >> "); // 수학점수 입력
			intMath[i] = scan.nextLine();
			
		} // for end

		System.out.println("===========================================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("-------------------------------------------");
		for (i = 0; i < 3; i++) {
			System.out.println(strname1[i] +"\t" + intKor[i] + "\t" + intEng[i] + "\t" + intMath[i]);
		}
		System.out.println("-------------------------------------------");
	} // main end
} // class end