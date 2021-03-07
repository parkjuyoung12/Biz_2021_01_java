package com.callor.score;

import java.util.List;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.MenuServiceImplV1;
import com.callor.score.service.ScoreServiceImplV1;

public class ScoreEx_01 {

	public static void main(String[] args) {

		MenuServiceImplV1 selector = new MenuServiceImplV1();
		ScoreServiceImplV1 scoreService = new ScoreServiceImplV1();

		while (true) {

			System.out.println("=============================\r\n" + "빛나라 고교 성적처리 시스템\r\n"
					+ "-----------------------------\r\n" + "1. 학생성적 점수 생성\r\n" + "2. 학생성적 점수 파일에 저장\r\n"
					+ "3. 성적결과 확인\r\n" + "QUIT. 끝내기\r\n" + "=============================\r\n");
			System.out.print("선택 >> ");

			/**
			 * 사용자가 선택한 메뉴의 번호 또는 입력 유효성 체크 결과 1~3 : (정상 입력) 0 : (QUIT) -1: (비정상 입력)
			 */
			int sel = selector.selectMenu();

			// === 입력값 검토(0이나 -1이 오진 않았는지) ===
			// 유효하지 않은 입력 시(if~continue)
			if (sel == -1) {
				System.out.println("[ 1~3사이로 입력하세요. ]");
				continue;
			}

			// QUIT 입력 시(if~break)
			if (sel == 0) {
				System.out.println("[ 프로그램을 종료합니다. ]");
				break;
			}

			// === 1, 2, 3 선택 시 ===
			if (sel == 1) {
				// TODO 점수 생성 메서드 실행
				scoreService.makeScore();
				// continue;
			} else if (sel == 2) {
				// TODO 점수를 파일에 저장하는 메서드 실행
				scoreService.saveScoreToFile();
			} else if (sel == 3) {
				// TODO 저장한 점수 파일을 불러오는 메서드 실행 및 점수 파일 출력
				scoreService.loadScoreFromFile();
				List<ScoreVO> scoreList = scoreService.getScoreList();

				System.out.println("=====================================================\n "
						+ "순번\t국어\t영어\t수학\t음악\t국사\t총점\t평균\r\n"
						+ "-----------------------------------------------------");
				for (ScoreVO vo : scoreList) {
					System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\t%.2f\n", vo.getCount(), 
							vo.getKor(), vo.getEng(), vo.getMath(), vo.getMusic()
							, vo.getHistory(), vo.getSum(), vo.getAvg());
				}
				System.out.println("=================================================");
				
			} else /* Test 후 삭제 */ {
				try {
					throw new Exception("메서드 검토: MenuServiceImplV1 클래스의 selectMenu()에서 예기치 않은 결과가 반환되었습니다.");
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					System.exit(-1);
				}
			}

		} // while(true)

	}// END::main

}// END::publicClass
