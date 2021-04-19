package quiz;

import java.util.Scanner;

public class B06_ScoreToGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		System.out.print("당신의 점수는? : ");
		score = sc.nextInt();
		if(score < 0 || score > 100){
			System.out.println("0 이상 100 이하의 양수만 입력 가능");
		} else if(score >= 90) {
			System.out.println("당신의 점수는 A등급 입니다");
		} else if(score >= 80) {
			System.out.println("당신의 점수는 B등급 입니다");
		} else if(score >= 70) {
			System.out.println("당신의 점수는 C등급 입니다");
		} else if(score >= 60) {
			System.out.println("당신의 점수는 D등급 입니다");
		} else {
			System.out.println("당신의 점수는 F등급 입니다");
		}
	}

}
