import java.util.Scanner;

public class B03_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("===============");
		int a = sc.nextInt();
		System.out.println("첫번째 입력 하신 값은 " + a + " 입니다");
		int b = sc.nextInt();
		System.out.println("두번째 입력 하신 값은 " + b + " 입니다");
		double c = sc.nextDouble();
		System.out.println("새번째 입력 하신 값은 " + c + " 입니다");
		System.out.println("입력 하신 값의 곱은 " +a * b * c + " 입니다");
	}

}
