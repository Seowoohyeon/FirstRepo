package quiz;

import java.util.Scanner;

public class B06_ScoreToGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		System.out.print("����� ������? : ");
		score = sc.nextInt();
		if(score < 0 || score > 100){
			System.out.println("0 �̻� 100 ������ ����� �Է� ����");
		} else if(score >= 90) {
			System.out.println("����� ������ A��� �Դϴ�");
		} else if(score >= 80) {
			System.out.println("����� ������ B��� �Դϴ�");
		} else if(score >= 70) {
			System.out.println("����� ������ C��� �Դϴ�");
		} else if(score >= 60) {
			System.out.println("����� ������ D��� �Դϴ�");
		} else {
			System.out.println("����� ������ F��� �Դϴ�");
		}
	}

}
