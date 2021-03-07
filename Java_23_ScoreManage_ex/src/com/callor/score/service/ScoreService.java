package com.callor.score.service;

public interface ScoreService {
	public void makeScore();// 점수생성
	public void saveScoreToFile(); // 점수 저장
	public void loadScoreFromFile(); // 점수 읽기
}
