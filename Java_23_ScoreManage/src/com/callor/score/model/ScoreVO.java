package com.callor.score.model;

public class ScoreVO {
	
	/** 순번 */
	private int count;
	/** 국어 점수 */
	private int kor;
	/** 영어 점수 */
	private int eng;
	/** 수학 점수 */
	private int math;
	/** 음악 점수 */
	private int music;
	/** 국사 점수 */
	private int history;
	/** 총점 */
	private int sum;
	/** 평균 */
	private double avg;
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getMusic() {
		return music;
	}

	public void setMusic(int music) {
		this.music = music;
	}

	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return String.format("ScoreVO [count=%d, "
				+ "kor=%d, eng=%d, math=%d, music=%d, history=%d, "
				+ "total=%d, avg= %.2f]"
				, this.count, this.kor, this.eng, this.math, this.music, this.history
				, this.sum, this.avg);
	}
}
