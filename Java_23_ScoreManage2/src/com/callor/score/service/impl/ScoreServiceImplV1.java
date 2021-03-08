package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.values.Values;

/*
 * Serivce 클래스 코드 순서
 * 1. 입력한 또는 자동 생성한 데이터를 담아둘
 * 		List 객체 선언 및 생성
 * 2. 데이터를 입력 또는 생성하여 List에 담아두기
 */

public class ScoreServiceImplV1 implements ScoreService {
	private String fileName;
	private List<ScoreVO> scoreList; // 객체선언

	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		fileName = "src/com/callor/score/score.txt";
	}

	@Override
	public void inputScore() {
		Scanner scan = new Scanner(System.in);
	}

	/*
	 * Random 클래스를 사용하여 점수 생성 makeScore() 에서만 사용할 것이므로 makeScore() method내에서 생성한다.
	 */
	@Override
	public void makeScore() {
		// TDO Random 성적표 작성

		// makeScore() 는 호출될 떄 마다 20개씩 데이터를
		// 생성하여 추가한다.
		// 이전에 저장된 데이터가 있더라도 계속 추가된다.

		/*
		 * list.remove(위치주소) list에 담긴 특정 위치의 항목을 삭제
		 * 
		 * list.removeAll(다른리스트) list에 담긴 데이터 중 다른리스트에 포함된 데이터들을 모두 삭제하라
		 * 
		 * 트릭을 사용한다 scoreList에 담긴 데이터들 중에서 자신의 데이터와 일치하는 값들 모두를 삭제하라
		 */
		scoreList.removeAll(scoreList);

		Random rnd = new Random();
		for (int i = 0; i < 20; i++) {
			/*
			 * i 값에 따라 00001 ~ 00020 까지 문자열을 생성한다 strNum에 저장한다.
			 */

			ScoreVO scoreVO = new ScoreVO();
			for ( i = 0; i < 20; i++) {
				scoreVO.setCount(i);
			}

			scoreVO.setKor(rnd.nextInt(100) + 1);

			int intEng = rnd.nextInt(100) + 1;
			scoreVO.setEng(intEng);

			int intMath = rnd.nextInt(100) + 1;
			scoreVO.setMath(intMath);

			int intMusic = rnd.nextInt(100) + 1;
			scoreVO.setMusic(intMusic);

			int intHistory = rnd.nextInt(100) + 1;
			scoreVO.setHistory(intHistory);

			scoreList.add(scoreVO);
		} // end :: for

		// 검사코드
//		for(ScoreVO vo : scoreList) {
//			System.out.println(vo.toString());
//		}
	}

	@Override
	public void saveScoreToFile() {


		// 객체이름 명명
		// 클래스이름의 첫글자를 소문자로 하여
		// 클래스이름을 모두 사용한다.
		FileWriter fileWriter = null; // fw
		PrintWriter printer = null; // pw

		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);

			// scoreList에 담긴 데이터를 파일로 출력
			for (ScoreVO vo : scoreList) {
				printer.print(vo.getCount() + ":");
				printer.print(vo.getKor() + ":");
				printer.print(vo.getEng() + ":");
				printer.print(vo.getMath() + ":");
				printer.print(vo.getMusic() + ":");
				printer.print(vo.getHistory() + "\n");
			}
			printer.close();
			fileWriter.close();
			System.out.println("파일 저장 성공 !!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일 생성중 문제 발생!!!");
		}
	}

	
	@Override
	public void loadScoreFromFile() {
		
		//기존에 저장되어 있던 리스트를 모두 제거하자
		// scoreList = new ArrayList<ScoreVO>()
		scoreList.removeAll(scoreList);
		/*
		 * 성적이 저장되어있는 score.txt 파일을 읽어서
		 * 성적정보를 scoreList에 담기
		 */
		FileReader fileReader = null;
		BufferedReader buffer = null;
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);		
			while(true) {
				String reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				// 읽어들인 문자열을 콜론(:)을 기준으로
				// 잘라서 배열로 만들어 달라
				String scores[] = reader.split(":");
				
				// 필드 생성자를 호출하여 인스턴스 저장할 값을 전달 하면서
				// 동시에 객체를 초기화(생성)
				ScoreVO vo = new ScoreVO(
						Integer.valueOf(scores[0]), //count
						Integer.valueOf(scores[1]), //kor
						Integer.valueOf(scores[2]), //eng
						Integer.valueOf(scores[3]), //math
						Integer.valueOf(scores[4]), //music
						Integer.valueOf(scores[5]) // history
						);
				scoreList.add(vo);
			}
			buffer.close();
			fileReader.close();
		
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
				System.out.println(fileName + "파일이 없습니다.");
//			e.printStackTrace();
		} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println("파일을 읽는동안 문제 발생");
			}
		this.printScore();
	}

	private void totalAndAvg() {
		for (ScoreVO vo : scoreList) {
			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();
			sum += vo.getHistory();

			float avg = (float) sum / 5;
			vo.setSum(sum);
			vo.setAvg(avg);
		}
	}

	@Override
	public void printScore() {

		// 출력전에 총점 평균 계산
		this.totalAndAvg();

		System.out.println(Values.dLine);
		System.out.println("빛나라 고교 성적 처리 시스템");
		System.out.println(Values.sLine);
		System.out.println("학번\t국어\t영어\t수학\t음악\t" + "국사\t총점\t평균\t석차");
		System.out.println(Values.sLine);

		for (ScoreVO vo : scoreList) {
			System.out.print(vo.getCount() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMath() + "\t");
			System.out.print(vo.getMusic() + "\t");
			System.out.print(vo.getHistory() + "\t");
			System.out.print(vo.getSum() + "\t");
			System.out.printf("%3.2f\t", vo.getAvg() + "\t");
			System.out.print(vo.getRank() + "\n");
		}
	}
}