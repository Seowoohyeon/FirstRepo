import java.util.Scanner;

public class B03_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("===============");
		int a = sc.nextInt();
		System.out.println("ù��° �Է� �Ͻ� ���� " + a + " �Դϴ�");
		int b = sc.nextInt();
		System.out.println("�ι�° �Է� �Ͻ� ���� " + b + " �Դϴ�");
		double c = sc.nextDouble();
		System.out.println("����° �Է� �Ͻ� ���� " + c + " �Դϴ�");
		System.out.println("�Է� �Ͻ� ���� ���� " +a * b * c + " �Դϴ�");
	}

}
