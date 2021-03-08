package com.callor.score.model;
/*
 * 성적처리를 위한 기본 데이터를 저장할
 * Value Object 클래스
 * DTO(Data Transfer Object),
 * DD(Data Define)
 */
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
	
	private int rank;
	
	/*
	 * 기본생성자 정의
	 * ScoreVO scroe = new Score() 명령문에서 호출되는
	 * 생성자 메서드
	 */
	public ScoreVO() {
	}

	/*
	 * 필드생성자 정의
	 * 객체를 생성할 떄 변수값을 지정하면서 만들떄
	 * ScoreVO scoreVO = new ScoreVO(학번, 국어점수, 영어점수, 수학점수, 음악점수, 역사점수)
	 * 
	 * 이떄 호출되는 method
	 */
	public ScoreVO(int count, int kor, int eng, int math, int music, int history) {
		super();
		this.count = count;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.music = music;
		this.history = history;
	}

	/*
	 * private으로 선언된 인스턴스변수에 접근할
	 * getter, setter method 생성
	 */
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
	
	public double getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	/*
	 * Object 클래스로부터 상속받은
	 * toString() method 재정의
	 * 
	 * VO 객체에 데이터를 저장한 후
	 * 잘 저장되었는지 확인하기 위한 Devuging 용
	 * method 재 정의
	 */
	@Override
	public String toString() {
		return String.format("ScoreVO [count=%d, "
				+ "kor=%d, eng=%d, math=%d, music=%d, history=%d, "
				+ "total=%d, avg= %.2f]"
				, this.count, this.kor, this.eng, this.math, this.music, this.history
				, this.sum, this.avg, this.rank);
	}
}
