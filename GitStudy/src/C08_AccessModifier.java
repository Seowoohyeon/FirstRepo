import myobj.Coffee;
import myobj.DiffPacakge;

public class C08_AccessModifier {
	
	/*	
	 	# ���� ������
	 	  - �ٸ� Ŭ�������� �ش� Ŭ������ �ڿ��� ����Ϸ��� �� ��
	 	  	������ ��������� �����Ѵ�
	 	  	
	 	# ���� �����ڸ� ���� ������ �� �ִ� �Ÿ��� ����
	 	  - ���� Ŭ���� ������ �ٸ� �ڿ�(���� ����� �Ÿ�)
	 	  - ���� ��Ű�� ������ �ٸ� �ڿ�
	 	  - �ٸ� ��Ű���� ������ ��ӹ��� �ڿ�
	 	  - �ٸ� ��Ű���� �ڿ�(���� �� �Ÿ�)
	 	  	
	 	# ���� �������� ����
	 	  - private
	 	     : ���� Ŭ���� ���ο����� ������ �� �ְ� �ȴ�
	 	  - default(�ƹ��͵� �Ⱦ�)
	 	     : ���� ��Ű�� ���ο����� �����Ӱ� ���� ����, �ٸ� ��Ű����x
	 	  - protected 
	 	     : ���� ��Ű�� ���ο����� �����Ӱ� ���� ����, �ٸ� ��Ű�������� ��ӹ��� Ŭ������ ���� ����
	 	  - public
	 	  	 : �ٸ� ��Ű�������� �����Ӱ� ������ �� �ִ� �ڿ��� �ȴ�
	 */
	
	public static void main(String[] args) {
		C08_SamePackage instance = new C08_SamePackage();
		
		instance.protected_method();
		instance.public_method();
		instance.default_method();
		
		DiffPacakge instance2 = new DiffPacakge();
		
		instance2.public_method();
		
		Coffee coffee = new Coffee(Coffee.AMERICANO, 1500, 10, Coffee.COLOMBIA);
		Coffee coffee1 = new Coffee(Coffee.CAFE_LATTE, 1800, 15, Coffee.BRAZIL);
		Coffee coffee2 = new Coffee(Coffee.CAFE_MOCHA, 2500, 20, Coffee.ETHIOPIA);
		Coffee coffee3 = new Coffee(Coffee.CARAMEL_MACCHIATO, 3500, 5, Coffee.KENYA);
		
		System.out.println(coffee.getCoffeeName());
		System.out.println(coffee.getCoffeeCode());
		System.out.println(coffee.getOriginName());
		System.out.println(coffee.getOriginCode());
	}
}


class Snack {
	int size = 10;
	
	private void eat() {
		System.out.println(size - 1);
	}
}

class HoneyButterChip extends Snack {
	private void abc() {
		System.out.println(size);
	}
}

class Choco extends DiffPacakge {
	public Choco() {
		// ��ӹ����� �ٸ� ��Ű�������� ��밡��
		this.protected_method();
	}
	void abc() {
		Snack s = new Snack();
		System.out.println(s.size);
	}
}











