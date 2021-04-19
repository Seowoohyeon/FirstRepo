package myobj.school;

import java.util.Random;

//대외적으로 보일 필요가 없으므로 private
public class Student2 {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	private static Random ran = new Random(); 
	private static int sno = 0;
	
	public static int BEST_TOTAL = 0;
	
	private static int getRandomScore() {
		return ran.nextInt(101); // Math.random() * 101 과 같다
	}
	
	
	public Student2() {
		kor = getRandomScore();
		eng = getRandomScore();
		math = getRandomScore();
		name = String.format("학생%06d", sno++); // %06d : 앞에 0을 6개 붙인다
		BEST_TOTAL = (int)Math.max(getTotal(), BEST_TOTAL);
		//int total = getTotal();
		//BEST_TOTAL = getTotal() > BEST_TOTAL ? getTotal() : BEST_TOTAL; 
	}
	
	public int getTotal() { //총점을 구하는 메서드
		return kor + eng + math;
	}
	
	public double getAvg() {	//평균을 구하는 메서드
		return getTotal() / 3.0;
	}
	
	public String getTranscript() { // 성적표를 출력하는 메서드
		return String.format("%s\t/ %d\t/ %.2f", name, getTotal(), getAvg()); 
		//prinf와 비슷하지만 format은 문자열을 '저장'함(문자열을 만드는 함수)
	}
	
}














