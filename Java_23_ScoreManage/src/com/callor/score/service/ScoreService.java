package com.callor.score.service;

public interface ScoreService {
	
	/** 점수 생성 */
	public void makeScore();
	
	/** 점수 저장 */
	public void saveScoreToFile();
	
	/** 점수 파일 불러오기 */
	public void loadScoreFromFile();
	

}
