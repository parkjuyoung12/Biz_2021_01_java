package com.callor.score.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.model.ScoreVO;

public class ScoreServiceImplV1 implements ScoreService {

	/** 학생들의 점수 리스트 */
	private List<ScoreVO> scoreList = new ArrayList<>();
	/** 랜덤 객체 */
	private Random rnd = new Random();
 
	public List<ScoreVO> getScoreList(){
		return this.scoreList;
	}
	
	@Override
	public void makeScore() { // 점수생성

		int count;
		int kor, eng, math, music, history;
		int sum;
		double avg;

		for (int i = 0; i < 20; i++) {
			// 1. 임시로 생성
			count = i + 1;
			kor = rnd.nextInt(100) + 1;
			eng = rnd.nextInt(100) + 1;
			math = rnd.nextInt(100) + 1;
			music = rnd.nextInt(100) + 1;
			history = rnd.nextInt(100) + 1;
			sum = kor + eng + math + music + history;
			avg = (double) sum / 5d;

			// 2. 한 VO 객체에 담기(Setter)
			ScoreVO vo = new ScoreVO();
			vo.setCount(count);
			vo.setKor(kor);
			vo.setEng(eng);
			vo.setMath(math);
			vo.setMusic(music);
			vo.setHistory(history);
			vo.setSum(sum);
			vo.setAvg(avg);

			// 3. 그 VO를 리스트에 담기
			scoreList.add(vo); // 한 ROW
		}

	}// makeScore()

	@Override
	public void saveScoreToFile() { // 점수 저장
		// TODO 주스트림 FileWriter, 보조스트림 PrintWriter 사용
		FileWriter fileWriter;
		PrintWriter printer;
		try {
			fileWriter = new FileWriter("resource/Score.txt");
			printer = new PrintWriter(fileWriter);

			for (int i = 0; i < scoreList.size(); i++) {
				ScoreVO vo = scoreList.get(i);
				printer.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\t%.2f\n", vo.getCount(), vo.getKor(), vo.getEng(),
						vo.getMath(), vo.getMusic(), vo.getHistory(), vo.getSum(), vo.getAvg());
			}

			printer.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// saveScoreToFile()

	@Override
	public void loadScoreFromFile() { // 점수 파일 불러오기
		// 0. 리스트 초기화(중복 방지)
		scoreList.clear();
		
		try {
			// 1. 스트림 열기
			FileReader fileReader = new FileReader("resource/Score.txt");
			BufferedReader buffer = new BufferedReader(fileReader);

			// 2. 문자열 가져오기 (및 처리)
			while (true) {

				String row = buffer.readLine();
				
				if(row == null) { // NULL이면 마지막 줄을 지나간 것이므로 break
					break;
				}
				
				// (파싱) \t으로 파싱
				String[] columns = row.split("\t");
				
				// 파싱된 조각들을 각각의 vo.set에(멤버변수에) 담기
				ScoreVO vo = new ScoreVO();
				vo.setCount( Integer.valueOf(columns[0]) );
				vo.setKor( Integer.valueOf(columns[1]) );
				vo.setEng( Integer.valueOf(columns[2]) );
				vo.setMath( Integer.valueOf(columns[3]) );
				vo.setMusic( Integer.valueOf(columns[4]) );
				vo.setHistory( Integer.valueOf(columns[5]) );
				vo.setSum( Integer.valueOf(columns[6]) );
				vo.setAvg( Double.valueOf(columns[7]) );
				
				// scoreList에 vo를 저장
				scoreList.add(vo);
				
			}// while(true)
			
			// 3. 스트림 닫기
			buffer.close();
			fileReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}// loadScoreFromFile()

	// FIXME 테스트 후 지우기
	public static void main(String[] args) {
		ScoreServiceImplV1 testObject = new ScoreServiceImplV1();
//		testObject.makeScore();
//		testObject.saveScoreToFile();
		testObject.loadScoreFromFile();
		
		for( ScoreVO vo : testObject.scoreList ) {
			System.out.println(vo);
		}

	}// END::main for test

}
