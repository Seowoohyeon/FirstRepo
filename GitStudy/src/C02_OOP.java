import myobj.BallPen;
import myobj.Peach;

public class C02_OOP {

	/*
			# ��ü���� ���α׷��� (OOP : Object Oriented Programming)
		  		- ���� �����ϴ� ��� �͵��� ������ �Լ��� ǥ���Ϸ��� ���α׷��� �����
		  		- ������ �Լ��� ���к��ϰ� ����ϱ� ���ٴ� ���ǿ� �����ϴ� ��ü ������ ��� ǥ���Ͽ� �������� �ø���
		  		- ��ü : ���� �����ϴ� ��� ���� ���Ѵ�

		  	
		  	# Ŭ����
		  		- ��ü�� ���α׷��� ���� ǥ���� ��
		  		- Ŭ������ ��ü�� ���赵�̴� (������ ���������� ��ü�� ����)
		  		- Ŭ������ ���� �����ϴ� ���� ��ü�� �ν��Ͻ���� �θ���
		  		- Ŭ������ ������ ���� Ÿ���̴�
		  
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Apple a1 = new Apple();
		Apple a2 = new Apple();
		Apple a3 = new Apple();
		
		// �ٸ� ��Ű���� ������ �ۺ�Ŭ���� ���
		myobj.Peach p1 = new myobj.Peach();
		Peach p2 = new Peach();
		
		a1.cal = 100;
		a2.cal = 120;
		a3.cal = 150;
		
		System.out.println(a1.cal);
		System.out.println(a2.cal);
		System.out.println(a3.cal); */
		
		BallPen bp = new BallPen(16);
		bp.size = 10;
		bp.capacity = 10.5;
		bp.color = "Black";
		bp.useing = "�ʱ���!";
		bp.use();
		bp.notuse();
	}

}

class Apple { // Apple Ÿ���� 
	/*
	 	�ν��Ͻ� ����
	 	 - �� �ν��Ͻ����� �ٸ� ���� ���� �� �ִ� ����
	 	 - �ʵ�, �Ӽ�, ���, ����, ���� .....
	 */
	int size;
	int cal;
	long lifetime;
	double sweet;
	
	/*
	  	�ν��Ͻ� �޼���
	  	  - �ν��Ͻ� ������ Ȱ���Ͽ� �ش� �ν��Ͻ��� ���¸� ��ȭ��Ű�� �޼���
	 */
	void eat() {
		size--;
		cal -= 10;
	}
}





















