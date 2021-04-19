import java.util.Scanner;

import myobj.BallPen;
import myobj.Peach;

class Orange{
	int sweet;
	int size;
	int[] color;
	
	// ������ - �� Ŭ������ �ν��Ͻ��� ������ �� ���� ���� ȣ��Ǵ� �޼���
	//		- �����ڴ� ���� ���� ȣ��Ǳ� ������ �ַ� �ʱ�ȭ �뵵�� ���ȴ�
	Orange() {
		System.out.println("�������� ������");
		sweet = 6;
		size = (int)(Math.random() * 3 +7);
		color = new int[] {255,165,0};
	}
	
	// �����ڵ� �޼ҵ� �̱� ������ �����ε� �� �� �մ�
	Orange(int sweet) {
		// �ν��Ͻ� ���� sweet�� �Ѱܹ��� sweet�� ����
		this.sweet = sweet;
		
		// this : �� �ν��Ͻ����� �ڱ� �ڽ��� ����Ų��
	}
	Orange(int sweet, int size, int[] color) {
		this.sweet = sweet;
		this.size = size;
		this.color = color;
	}
}
class Strawberry{
	
	// Ŭ������ �ν��Ͻ� ������ �ʱ�ȭ�� ���� ������ �迭�� �Ȱ��� �ʱⰪ�� ���Ѵ�
	int seed;
	String color;
	
	// �ٸ� �������� Ÿ���� �����ڰ� �����Ҷ��� �⺻ �����ڸ� �ڵ����� ���������� �ʴ´�
	public Strawberry(int seed) {
		this.seed = seed;
	}
}

public class C03_Constructor {
	
	/*
	 	# Ŭ������ ������ 
	 	  - Ŭ������ �̸��� �Ȱ��� �̸��� �޼���
	 	  - �޼ҵ����� ���� Ÿ���� �������� �ʴ´�
	 	  - �ν��Ͻ��� �����ϱ� ���ؼ��� new�� ���� �����ڸ� ȣ���ؾ� �Ѵ�
	 	  - �����ڸ� �ϳ��� �������� ���� Ŭ�������� �ڵ����� ������ �⺻ �����ڰ� �����Ѵ�
	 	  - �����ڰ� ��� ����� �Ŀ��� ������ �ν��Ͻ��� �ּҰ��� ��ȯ�ȴ�
	 */

	public static void main(String[] args) {
		
		// Ŭ���� �̸��� �Ȱ��� �̸��� �޼ҵ带 ȣ���� �ν��Ͻ��� ������ �� �ִ�
		
		// �����ڸ� ȣ���ϴ� ������
		String s1 = new String();
		Peach p1 = new Peach();
		Scanner sc = new Scanner(System.in);
		
		Orange[] orange_box = new Orange[7];
		for (int i = 0; i < 5; i++) {
			orange_box[i] = new Orange();
		}
		System.out.println(orange_box[0].sweet);
		System.out.println(orange_box[1].size);
		System.out.println(orange_box[2].color[0]);
		System.out.println(orange_box[3].color[1]);
		System.out.println(orange_box[4].color[2]);
		
		// �����ڸ� �����ε��� Ŭ������ �پ��� ���� ����� �����
		new Orange(5);
		new Orange(9, 10, new int[] {255,165,0});
		
		Strawberry berry01 = new Strawberry(150);
		
		System.out.println(berry01.color);
		System.out.println(berry01.seed);
		
		
		System.out.println("=====================================");
		
		
		BallPen bp = new BallPen(30.4);
		System.out.println(bp.capacity);
		new BallPen();
	}

}




























