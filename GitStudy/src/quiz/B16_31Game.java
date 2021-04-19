package quiz;

import java.util.Random;
import java.util.Scanner;

public class B16_31Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		boolean bool = true;

		System.out.println(" 게임 시작 ");
		int count = 0;
		while (true) {
			System.out.println("당신의 차례");
			System.out.print("1 ~ 3 : ");
			int yourNum = sc.nextInt();
			for (int i = 0; i < yourNum; i++) {
				count++;
				System.out.println(" " + count);
				if (count == 31) {
					System.out.println("패배");
					break;
				}
			} if (count >= 31) {
				break;
			}
			System.out.println("컴퓨터 차례");
			int comNum = ran.nextInt(3) + 1;
			for (int i = 0; i < comNum; i++) {
				count++;
				System.out.println(" "+count);
				if (count == 31) {
					System.out.println("승리");
					break;
				}
			} if (count >= 31) {
				break;
			}
		}
		

	}
}
